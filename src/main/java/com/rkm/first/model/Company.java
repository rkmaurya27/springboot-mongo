package com.rkm.first.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(collection = "company")
//@Entity
public class Company {
    @Id
    @NotNull
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Object _id;
    @NotNull
    @NotEmpty(message = "Name should not be empty")
    @Length(min = 4)
    private String name;
    @NotNull(message = "NOW cannot be empty")
    @CreatedDate
    private Date now;
    @NotNull
    private long revenue;

    public Object get_id() {
        return _id;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
