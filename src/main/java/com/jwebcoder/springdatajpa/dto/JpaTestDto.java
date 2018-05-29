package com.jwebcoder.springdatajpa.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class JpaTestDto {


    private String id;
    private int version;
    private String title;
    private int column4;
    private String messageText;
    private Date dateSend;

}
