package com.example.demo.function;

import com.example.demo.repository.entity.UserEntity;
import com.example.demo.repository.ReactiveUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

import java.util.function.Function;


@Configuration
public class UserFunction {


    @Bean
    public Function<String, Mono<UserEntity>> userById(final ReactiveUserRepository repo) {
        return repo::findById;
    }

    @Bean
    public Function<UserEntity, Mono<UserEntity>> createUser(final ReactiveUserRepository repo) {
        return repo::save;
    }
}
