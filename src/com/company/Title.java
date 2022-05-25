package com.company;

public class Title {
    private int isbn;
    private int id;
    private String author;
    private String name;
    private String publisher;

    public Title(int id, int isbn, String author, String name, String publisher) {
        this.id = id;
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
