package com.example.tacocloud;

import com.example.tacocloud.config.UserAuth;
import com.example.tacocloud.model.Ingredient;
import com.example.tacocloud.repository.IngredientRepository;
import com.example.tacocloud.repository.UserAuthRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.tacocloud.model.Ingredient.Type;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }


}
