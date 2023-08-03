package com.example.tacocloud.repository;

import com.example.tacocloud.model.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}
