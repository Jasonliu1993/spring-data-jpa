package com.jwebcoder.springdatajpa.dto;

public class DetailDto {

    private String id;

    private String toDoctorId;

    private String toTeamId;

    private String contractTeamId;

    private String patientId;

    private String fromDoctorId;

    private String fromTeamId;

    private String status;

    private String approveStatus;

    private String approveStatusDesc;

    public DetailDto(String id, String toDoctorId, String toTeamId, String contractTeamId, String patientId, String fromDoctorId, String fromTeamId, String status, String approveStatus, String approveStatusDesc) {
        this.id = id;
        this.toDoctorId = toDoctorId;
        this.toTeamId = toTeamId;
        this.contractTeamId = contractTeamId;
        this.patientId = patientId;
        this.fromDoctorId = fromDoctorId;
        this.fromTeamId = fromTeamId;
        this.status = status;
        this.approveStatus = approveStatus;
        this.approveStatusDesc = approveStatusDesc;
    }

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

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getApproveStatusDesc() {
        return approveStatusDesc;
    }

    public void setApproveStatusDesc(String approveStatusDesc) {
        this.approveStatusDesc = approveStatusDesc;
    }
}
