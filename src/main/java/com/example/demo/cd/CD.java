package com.example.demo.cd;


import com.example.demo.item.Item;

import javax.persistence.Entity;

@Entity
public class CD extends Item{


    private String albumName;

    public CD() {};


    public CD(String category, String albumName) {
        super(category);
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
