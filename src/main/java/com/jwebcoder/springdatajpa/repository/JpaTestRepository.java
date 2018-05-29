package com.jwebcoder.springdatajpa.repository;

import com.jwebcoder.springdatajpa.entity.JpaTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jpaTestRepository")
public interface JpaTestRepository extends JpaTestNoRepositoryBean<JpaTest> {
//public interface JpaTestRepository extends PagingAndSortingRepository<JpaTest, String> {

    @Query(value = "SELECT * FROM jpa_test where title = ?1", nativeQuery = true)
    List<JpaTest> queryAllByTitle(String title);


}
