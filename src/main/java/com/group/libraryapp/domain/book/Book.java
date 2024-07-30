package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false,length = 255,name = "name")
    private String name;

    public Book(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    protected Book(){

    }

    public String getName() {
        return name;
    }
}
