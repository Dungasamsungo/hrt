package com.projeto.hrt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String status;
    private String location;
    private String proposedTime;
    private String actualStartTime;
    private String endTime;
    private String exitTime;


    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getProposedTime() {
        return proposedTime;
    }
    public void setProposedTime(String proposedTime) {
        this.proposedTime = proposedTime;
    }
    public String getActualStartTime() {
        return actualStartTime;
    }
    public void setActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public String getExitTime() {
        return exitTime;
    }
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    
    
}
