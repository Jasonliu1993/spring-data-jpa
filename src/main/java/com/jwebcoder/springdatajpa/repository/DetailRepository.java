package com.jwebcoder.springdatajpa.repository;

import com.jwebcoder.springdatajpa.dto.DetailDto;
import com.jwebcoder.springdatajpa.entity.Detail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailRepository extends PagingAndSortingRepository<Detail, String> {

    @Query(value = "select new com.jwebcoder.springdatajpa.dto.DetailDto(D.id, D.toDoctorId, D.toTeamId, D.contractTeamId, D.patientId, D.fromDoctorId, D.fromTeamId, D.status, " +
            "(SELECT ST.status FROM Status ST WHERE ST.approveTime = (SELECT MAX(ST1.approveTime) FROM Status ST1 WHERE ST.id = ST1.id) AND ST.id = D.id), " +
            "(SELECT ST.statusDesc FROM Status ST WHERE ST.approveTime = (SELECT MAX(ST1.approveTime) FROM Status ST1 WHERE ST.id = ST1.id) AND ST.id = D.id))" +
            "FROM Detail D where D.toDoctorId = ?1")
    List<DetailDto> getDetailDto(String doctorId);

}
