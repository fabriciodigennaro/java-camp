package org.example.baseknowlegde;

public class ControlStatements {

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

    public static void tryCatchStatement() {

        try {
            long counter = Math.round(Math.random() * 10);
            System.out.println(counter);
            if (counter % 2 == 0) {
                throw new IllegalArgumentException();
            } else if (counter == 5) {
                throw new RuntimeException();
            } else {
                System.out.println("Try block executed without exceptions");
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException happened");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException happened");
        } finally {
            System.out.println("Finally block executed");
        }
    }

}
