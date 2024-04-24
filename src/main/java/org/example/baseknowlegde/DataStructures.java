package org.example.baseknowlegde;

import java.sql.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class DataStructures {

//    int[] intArray;
//
//    String[] stringArray;
//
//    List<Integer> intLIst;
//
//    List<String> stringList;
//
//    List<List<String>> listOfStringLists;
//
//    Map<String, String> stringsMap;
//
//    Map<Integer, String> intStringMap;

    public static void arrays() {
        int[] numbers = {1,2,3,4};
        int[] numbers2 = new int[5];

        System.out.println(numbers[1]);

        numbers[1] = 7;

        System.out.println(numbers[1]);

        System.out.println(numbers.length);

        System.out.println("Printing numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Printing numbers2:");
        for (int number : numbers2) {
            System.out.println(number);
        }

    }

    public static void lists() {
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new LinkedList<>();

        names.add("Sol");
        names.add("Fabri");
        System.out.println(names.get(0));
        System.out.println(names.isEmpty());

        numbers.addAll(List.of(1,2,3));

        System.out.println(names);
        System.out.println(numbers);
    }

    public static void maps() {
        Map<Integer, String> users = new HashMap<>();
        Map<String, List<Integer>> incomingTransactionsPerMonth = new ConcurrentHashMap<>();

        users.put(1, "Sol");
        users.put(2, "Fabri");
        System.out.println(users);
        users.put(3, "Bruno");
        System.out.println(users);
        users.remove(3);
        System.out.println(users);
        for (Entry<Integer, String> user : users.entrySet()) {
            System.out.printf("User with ID %d has name %s%n", user.getKey(), user.getValue());
        }

        incomingTransactionsPerMonth.put("JAN", new ArrayList<>(List.of(20, 30, 5)));
        System.out.println(incomingTransactionsPerMonth);
        List<Integer> januaryTransactions = incomingTransactionsPerMonth.get("JAN");
        januaryTransactions.add(100);
        incomingTransactionsPerMonth.put("JAN", januaryTransactions);
        System.out.println(incomingTransactionsPerMonth);

        List<Integer> februaryTransactions = incomingTransactionsPerMonth.getOrDefault("FEB", new ArrayList<>());
        februaryTransactions.add(50);
        incomingTransactionsPerMonth.put("FEB", februaryTransactions);
        System.out.println(incomingTransactionsPerMonth);

    }

}
