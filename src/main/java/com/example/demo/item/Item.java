package com.example.demo.item;

import javax.persistence.*;

@MappedSuperclass
//@Inheritance(strategy = InheritanceType.JOINED)
public class Item {


    @Id @GeneratedValue
    private Long id;


    private String category;


    public Item() {};

    public Item(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
