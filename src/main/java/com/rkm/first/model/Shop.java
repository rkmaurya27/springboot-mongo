package com.rkm.first.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Entity
@Document(collection = "shop")
public class Shop {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String name;
    long value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
