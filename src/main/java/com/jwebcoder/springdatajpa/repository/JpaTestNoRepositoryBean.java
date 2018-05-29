package com.jwebcoder.springdatajpa.repository;

import com.jwebcoder.springdatajpa.dto.JpaTestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface JpaTestNoRepositoryBean<T> extends CrudRepository<T, Long> {

    List<T> query(JpaTestDto jpaTestDto);

}
