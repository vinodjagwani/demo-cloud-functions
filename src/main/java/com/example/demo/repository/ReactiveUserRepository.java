package com.example.demo.repository;

import com.example.demo.repository.entity.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactiveUserRepository extends ReactiveCrudRepository<UserEntity, String> {

    Mono<UserEntity> findById(final String id);

    Flux<UserEntity> findByLastName(final String lastName);
}

