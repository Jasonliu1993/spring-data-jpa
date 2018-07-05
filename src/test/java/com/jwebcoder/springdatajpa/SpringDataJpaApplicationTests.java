package com.jwebcoder.springdatajpa;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jwebcoder.springdatajpa.repository.DetailRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaApplicationTests {

    @Autowired
    private DetailRepository detailRepository;

    @Test
    public void contextLoads() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValueAsString(detailRepository.getDetailDto("DASFSD"));
    }

}
