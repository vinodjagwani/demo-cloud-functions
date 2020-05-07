package com.example.demo.repository.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Immutable;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Getter
@Setter
@Immutable
@Table("users")
public class UserEntity {

    @PrimaryKey
    private String id;
    private String firstName;
    private String lastName;
}
