package com.maybank.hello.repository;

import com.maybank.hello.model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HelloRepository extends JpaRepository<HelloWorld, Long> {
    Optional<HelloWorld> findTopByOrderByIdDesc();
}
