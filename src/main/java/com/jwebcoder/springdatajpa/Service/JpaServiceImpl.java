package com.jwebcoder.springdatajpa.Service;

import com.jwebcoder.springdatajpa.entity.JpaTest;
import com.jwebcoder.springdatajpa.repository.JpaTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaServiceImpl implements JpaService {

    @Autowired
    @Qualifier("jpaTestRepository")
    private JpaTestRepository jpaTestRepository;

    @Override
    public List<JpaTest> queryAll() {
        return jpaTestRepository.queryAllByTitle("测试");
    }
}
