package com.murdock.books.spring.guide.ioc.container;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author weipeng2k 2018年09月24日 下午19:48:53
 */
public class Brand {
    /**
     * 名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date gmtCreate;

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

    public void setGmtCreateLabel(String label) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            this.gmtCreate = dateFormat.parse(label);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}
