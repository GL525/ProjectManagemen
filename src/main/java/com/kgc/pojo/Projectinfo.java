package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Projectinfo {
    private Long id;

    private String projectinfoname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stardate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    private Long status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectinfoname() {
        return projectinfoname;
    }

    public void setProjectinfoname(String projectinfoname) {
        this.projectinfoname = projectinfoname == null ? null : projectinfoname.trim();
    }

    public Date getStardate() {
        return stardate;
    }

    public void setStardate(Date stardate) {
        this.stardate = stardate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}