package com.murdock.books.spring.guide.classic.war.domain;

import java.util.Date;

/**
 * @author weipeng2k 2018年07月22日 下午17:06:18
 */
public class BookModel {

    private Long id;
    private String name;
    private String desc;
    private Long authorId;
    private Date gmtCreate;
    private Date gmtModified;

    private AuthorModel author;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
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

    public AuthorModel getAuthor() {
        return author;
    }

    public void setAuthor(AuthorModel author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", authorId=" + authorId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", author=" + author +
                '}';
    }
}
