package com.jwebcoder.springdatajpa.controller;

import com.jwebcoder.springdatajpa.Service.JpaService;
import com.jwebcoder.springdatajpa.entity.JpaTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private JpaService service;

    @GetMapping("/test")
    public List<JpaTest> queryAll() {

        return service.queryAll();

    }

}
