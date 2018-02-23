package com.example.demo.musician;


import com.example.demo.cd.CD;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Musician {

    @Id @GeneratedValue
    private Long id;

    private String musicianName;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<CD> cds = new HashSet<>();

    public Musician() {};

    public Musician(String musicianName, Set<CD> cds) {
        this.musicianName = musicianName;
        this.cds = cds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMusicianName() {
        return musicianName;
    }

    public void setMusicianName(String musicianName) {
        this.musicianName = musicianName;
    }

    public Set<CD> getCds() {
        return cds;
    }

    public void setCds(Set<CD> cds) {
        this.cds = cds;
    }
}

