package com.example.demo;

import com.example.demo.cd.CD;
import com.example.demo.cd.CDRepository;
import com.example.demo.item.Item;
import com.example.demo.item.ItemRepository;
import com.example.demo.book.Book;
import com.example.demo.book.BookRepository;
import com.example.demo.musician.Musician;
import com.example.demo.musician.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    CDRepository cdRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    MusicianRepository musicianRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


        @Bean
    CommandLineRunner run() {
	    return args -> {



	        bookRepository.save(new Book("category2",45));



            cdRepository.save(new CD("category3","album10"));


            Set<CD> cds = new HashSet<>();



            Stream.of("CD1","CD2","CD3")
                    .forEach((name) -> {
                        cds.add(new CD(name,"album1"));
                    });


            musicianRepository.save( new Musician("alfred",cds));


            System.out.println(musicianRepository.findByMusicianNameLike("alfred"));

	    };
        }





}
