package com.github.javapedia.objects.person;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Person father;
    private Person mother;

    //Konstruktor domyslny ktory jest w kazej klasie
    //o ile nie napiszemy innego konstruktora
    public Person() {

    }

    public Person(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String name, String surname, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, Person father) {
        //używamy innego konstruktora
        this(name, surname);
        this.age = age;
        this.father = father;
    }

    public String showParentsName() {
        return "Parents name are: " + father.name;
    }

    public String getDisplayName() {
        return "My name is: " + name + ", my surname is " + surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
