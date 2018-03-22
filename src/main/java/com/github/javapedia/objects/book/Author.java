package com.github.javapedia.objects.book;

public class Author {

    public String name;
    public String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
