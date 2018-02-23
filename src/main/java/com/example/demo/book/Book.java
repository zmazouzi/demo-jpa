package com.example.demo.book;

import com.example.demo.item.Item;

import javax.persistence.Entity;

@Entity

public class Book extends Item {



    private int numberOfPages;


    public Book() {};

    public Book(String category, int numberOfPages) {
        super(category);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
