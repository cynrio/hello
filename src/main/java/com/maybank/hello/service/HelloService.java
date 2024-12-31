package com.maybank.hello.service;

import com.maybank.hello.model.HelloWorld;
import com.maybank.hello.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public HelloWorld getMessage() {
        return helloRepository.findTopByOrderByIdDesc().orElse(new HelloWorld());
    }

    public void saveMessage(String message) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage(message);
        helloRepository.save(helloWorld);
    }
}