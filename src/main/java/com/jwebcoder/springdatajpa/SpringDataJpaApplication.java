package com.jwebcoder.springdatajpa;

import com.jwebcoder.springdatajpa.repository.JpaTestNoRepositoryBeanImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryFactoryBean.class)
@EnableJpaRepositories(repositoryBaseClass = JpaTestNoRepositoryBeanImpl.class)
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
}
