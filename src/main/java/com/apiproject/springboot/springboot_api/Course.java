package com.apiproject.springboot.springboot_api;

public class Course {
    private long id;
    private String name;
    private String author;
    //Constructor
    //Getters
    //toString

    public Course(int id, String name, String author ) {
        this.id = id;
        this.name = name;
        this.author = author;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
