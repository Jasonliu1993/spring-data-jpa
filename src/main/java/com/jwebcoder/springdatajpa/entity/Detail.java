package com.jwebcoder.springdatajpa.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "detail")
public class Detail {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(name = "to_doctor_id")
    private String toDoctorId;

    @Column(name = "to_team_id")
    private String toTeamId;

    @Column(name = "contract_team_id")
    private String contractTeamId;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "from_doctor_id")
    private String fromDoctorId;

    @Column(name = "from_team_id")
    private String fromTeamId;

    @Column(name = "status")
    private String status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getToDoctorId() {
        return toDoctorId;
    }

    public void setToDoctorId(String toDoctorId) {
        this.toDoctorId = toDoctorId;
    }


    public String getToTeamId() {
        return toTeamId;
    }

    public void setToTeamId(String toTeamId) {
        this.toTeamId = toTeamId;
    }


    public String getContractTeamId() {
        return contractTeamId;
    }

    public void setContractTeamId(String contractTeamId) {
        this.contractTeamId = contractTeamId;
    }


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }


    public String getFromDoctorId() {
        return fromDoctorId;
    }

    public void setFromDoctorId(String fromDoctorId) {
        this.fromDoctorId = fromDoctorId;
    }


    public String getFromTeamId() {
        return fromTeamId;
    }

    public void setFromTeamId(String fromTeamId) {
        this.fromTeamId = fromTeamId;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
