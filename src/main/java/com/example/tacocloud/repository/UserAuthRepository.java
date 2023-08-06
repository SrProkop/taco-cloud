package com.example.tacocloud.repository;

import com.example.tacocloud.config.UserAuth;
import org.springframework.data.repository.CrudRepository;

public interface UserAuthRepository extends CrudRepository<UserAuth, Long> {

    UserAuth findByUsername(String username);

}
