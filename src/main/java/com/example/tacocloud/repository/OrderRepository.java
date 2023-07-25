package com.example.tacocloud.repository;

import com.example.tacocloud.model.TacoOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);

    List<TacoOrder> findByDeliveryZipAndDeliveryCityIgnoreCase(
            String deliveryTo, String deliveryCity);

    List<TacoOrder> findByDeliveryCityOrderByDeliveryZip(String city);

    @Query(value = "Order o where o.deliveryCity='Seattle'", nativeQuery = true)
    List<TacoOrder> readOrdersDeliveredInSeattle();

}
