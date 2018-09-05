package com.murdock.books.spring.guide.springboot.dao.dataobject;

import java.util.Date;

/**
 * @author weipeng2k 2018年07月22日 下午14:20:05
 */
public class AuthorDO {
    private Long id;
    private String name;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer rate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "AuthorDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", rate=" + rate +
                '}';
    }
}
