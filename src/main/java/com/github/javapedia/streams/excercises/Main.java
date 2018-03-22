package com.github.javapedia.streams.excercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class Main {

    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();
        HashSet<String> firstNamesSet = new HashSet<>();
        HashSet<String> lastNamesSet = new HashSet<>();
        HashSet<LocalDate> dateOfBirthSet = new HashSet<>();
        HashSet<Address> addressSet = new HashSet<>();
        firstNamesSet.add("Ania");
        firstNamesSet.add("Kasia");
        firstNamesSet.add("Sylwia");
        firstNamesSet.add("Marta");
        firstNamesSet.add("Zuza");
        lastNamesSet.add("Kawa");
        lastNamesSet.add("Malinowski");
        lastNamesSet.add("Aab");
        lastNamesSet.add("Morawiec");
        lastNamesSet.add("Pol");
        lastNamesSet.add("Kręcina");
        lastNamesSet.add("Sobieski");
        lastNamesSet.add("Krychowiak");
        lastNamesSet.add("Czop");
        String input = "1988-07-22";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        input = "1998-07-12";
        date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        input = "1998-06-21";
        date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        input = "1977-02-26";
        date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        input = "1966-03-12";
        date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        input = "1955-08-29";
        date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        input = "1933-09-02";
        date = LocalDate.parse(input, formatter);
        dateOfBirthSet.add(date);
        Address address = new Address("Jugosłowiańska 22", "Wrocław", "Niemcy");
        addressSet.add(address);
        address = new Address("Piłsudskiego 12", "Warszawa", "Polska");
        addressSet.add(address);
        address = new Address("Mielczarskiego 43", "Gdańsk", "Niemcy");
        addressSet.add(address);
        address = new Address("9 Maja 65", "Gdynia", "Rumunia");
        addressSet.add(address);
        address = new Address("Reagana 2", "Wrocław", "Polska");
        addressSet.add(address);

        // tworze losowych uzytkownikow
        for (int i = 0; i < 30; i++) {
            String randomFirstName = firstNamesSet.stream()
                    .skip((int) (firstNamesSet.size() * Math.random()))
                    .findFirst()
                    .orElse(null);

            String randomLastName = lastNamesSet.stream()
                    .skip((int) (lastNamesSet.size() * Math.random()))
                    .findFirst()
                    .orElse(null);

            LocalDate randomDateOfBirth = dateOfBirthSet.stream()
                    .skip((int) (dateOfBirthSet.size() * Math.random()))
                    .findFirst()
                    .orElse(null);

            Address randomAddress = addressSet.stream()
                    .skip((int) (addressSet.size() * Math.random()))
                    .findFirst()
                    .orElse(null);
            User user = new User(randomFirstName, randomLastName, randomDateOfBirth, randomAddress);
            userSet.add(user);
        }

        //1. nazwiska dluzsze niz 5 znakow
        userSet.stream()
                .filter(s -> s.getLastName().length() > 5)
                .forEach(System.out::println);

        //2. uzytkownicy z dwoch dowolnych panstw
        userSet.stream()
                .filter(s -> s.getAddress().getCountry() == "Polska" || s.getAddress().getCountry() == "Niemcy")
                .forEach(System.out::println);

        //3. uzytkownicy z nazwiskami dluzszymi niz 6 liter posortwani po nazwie ulicy
        List<String> listOfUserSWithNameLongerThan6Letters = userSet.stream()
                .filter(s -> s.getLastName().length() > 6)
                //.sorted((s,s1) -> s.getAddress().getStreet().length())
                .sorted(comparingInt(s -> s.getAddress().getStreet().length()))
                .map(s -> s.getLastName())
                .collect(Collectors.toList());

        //4. max, min i srednia wieku
        IntSummaryStatistics minMaxAndAverage = userSet.stream()
                .collect(Collectors.summarizingInt(User::getAge));
        System.out.println(minMaxAndAverage);

        //5. mapa stringow i listy uzytkownikow
        Map<String, List<User>> usersByLastName = userSet.stream()
                .collect(Collectors.groupingBy(User::getLastName, Collectors.mapping(Function.identity(), Collectors.toList())));

        for (Map.Entry<String, List<User>> entry : usersByLastName.entrySet()) {
            System.out.print("Nazwisko: " + entry.getKey() + "\nUżytkownicy: " + entry.getValue() + " ");
        }

        //6. lista uzytkownikow posortowana po ulicy
        List<User> userList = userSet.stream()
                .sorted(Comparator.comparing(s0 -> s0.getAddress().getStreet()))
                .collect(Collectors.toList());

        //7. zbior stringow z imienia i nazwiska rozdzielonych spacja
        Set<String> setOfFullNames = userSet.stream()
                .map(s -> s.getFirstName() + " " + s.getLastName())
                .collect(Collectors.toSet());
    }
}
