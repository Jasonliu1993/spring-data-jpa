package com.jwebcoder.springdatajpa.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "jpa_test")
public class JpaTest {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(name = "version")
    private int version;

    @Column(name = "title")
    private String title;

    @Column(name = "column_4")
    private int column4;

    @Column(name = "messageText")
    private String messageText;

    @Column(name = "dateSende")
    private Timestamp dateSende;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColumn4() {
        return column4;
    }

    public void setColumn4(int column4) {
        this.column4 = column4;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Timestamp getDateSende() {
        return dateSende;
    }

    public void setDateSende(Timestamp dateSende) {
        this.dateSende = dateSende;
    }
}
