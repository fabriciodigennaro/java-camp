package org.example.baseknowlegde;

import org.w3c.dom.ls.LSOutput;

public class Conditionals {

    public static void ifElse() {
        long counter = Math.round(Math.random() * 10);
        System.out.println(counter);

        if (counter > 7) {
            System.out.println("Counter is above 7");
        } else if (counter > 4) {
            System.out.println("Counter is above 4");
        } else {
            System.out.println("Counter is equal or lower than 4");
        }

        String result = counter % 2 == 0 ? "counter is even" : "counter is odd";
        System.out.println(result);
    }

    public static void switchStatement() {
        long counter = Math.round(Math.random() * 10);
        System.out.println(counter);

        switch ((int) counter) {
            case 1 :
                System.out.println("counter is 1");
                break;
            case 5 :
                System.out.println("counter is 5");
                break;
            case 2,3,4 :
                System.out.println("counter between 2 and 4");
                break;
            default:
                System.out.println("counter above 5");
        }

        // See switch evolution from java 7 to 17: https://medium.com/@javatechie/the-evolution-of-switch-statement-from-java-7-to-java-17-4b5eee8d29b7


    }
}
