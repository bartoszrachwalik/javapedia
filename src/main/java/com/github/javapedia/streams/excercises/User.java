package com.github.javapedia.streams.excercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private String uuid;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private LocalDateTime createdAt;
    private Address address;
    private int age;

    public User(String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        uuid = UUID.randomUUID().toString();
        createdAt = LocalDateTime.now();
        age = (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + dateOfBirth.toString() + " Wiek: " + age +
                "\n" + address.print();
    }

    public int getAge() {
        return this.age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }
}
