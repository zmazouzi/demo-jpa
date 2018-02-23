package com.example.demo.musician;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicianRepository extends JpaRepository<Musician,Long> {


    // find Musician by fuzzy search for username

    List<Musician> findByMusicianNameLike(String musicianName);
}
