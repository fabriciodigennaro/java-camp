package org.example.baseknowlegde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {

    // while
    // do while
    // for i
    // foreach
    // stream -> map, filter, foreach, etc

    static void whileLoop() {
        var counter = 0;

        while (counter < 10) {
            counter++;
            System.out.println("Counter in while is " + counter);
        }
    }

    static void doWhileLoop() {
        long counter = Math.round(Math.random() * 10);
        System.out.println(counter);

        do {
            System.out.println("Counter in do while is " + counter);
            counter++;
        } while (counter % 2 == 0);

    }

    static void forLoop() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        List<String> names = List.of("Sol", "Fabri", "Bruno");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        int[] amounts = { 30, 50, 21, 35, 77 };

        for (int i = 0; i < amounts.length; i++) {
            System.out.println(amounts[i]);
        }
    }

    static void foreachLoop() {
        List<String> names = List.of("Sol", "Fabri", "Bruno");

        for (String name : names) {
            System.out.println(name);
        }

        int[] amounts = { 30, 50, 21, 35, 77 };

        for (int amount : amounts) {
            System.out.println(amount);
        }
    }

    static void forEachMethod() {
        List<String> names = List.of("Sol", "Fabri", "Bruno");

//        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        Integer[] amounts = { 30, 50, 21, 35, 77 }; // array cannot be of primitives in order to convert into List

        Arrays.asList(amounts).forEach(System.out::println);
    }

    static void streams() {
        List<User> users = List.of(
            new User("Sol", "Argentina", 37),
            new User("Fabri", "Italy", 36),
            new User("Bruno", "Argentina", 10),
            new User("Pepito", "Spain", 13),
            new User("Marie", "France", 20)
        );

        List<String> adultUserNames = users.stream()
                .filter(user -> user.age >= 18)
                .map(user -> user.name)
                .peek(name -> System.out.println("User name is: " + name))
//                .forEach(name -> System.out.println("User name is: " + name)) // This method does not return the element
                .toList();

        System.out.println(adultUserNames);
    }

    static class User {
        String name;
        String country;
        Integer age;

        public User(String name, String country, Integer age) {
            this.name = name;
            this.country = country;
            this.age = age;
        }
    }
}
