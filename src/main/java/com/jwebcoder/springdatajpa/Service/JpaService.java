package com.jwebcoder.springdatajpa.Service;

import com.jwebcoder.springdatajpa.entity.JpaTest;

import java.util.List;

public interface JpaService {

    List<JpaTest> queryAll();

}
