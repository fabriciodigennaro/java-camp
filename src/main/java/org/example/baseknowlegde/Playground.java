package org.example.baseknowlegde;

public class Playground {

    public static  void declarations() {
        Declarations declarations = new Declarations();

        System.out.println(declarations.getFamilySecret());

        Declarations declarations2;
        declarations2 = new Declarations("my name");

        System.out.println(declarations2);

        declarations2.incrementCounter();

        System.out.println(declarations2);

        String name = declarations.name;
        var name2 = declarations2.name;
        final var unchangeableName = declarations2.name;
        // unchangeableName = declarations.name; Not allowed!

        declarations2.resetCounter();

        System.out.println(declarations2);
    }

    public static void dataStructures() {
//        DataStructures.arrays();
//        DataStructures.lists();
        DataStructures.maps();
    }

    public static void controlStatements() {
//        ControlStatements.ifElse();
//        ControlStatements.switchStatement();
        ControlStatements.tryCatchStatement();
    }

    public static void loops() {
//        Loops.whileLoop();
//        Loops.doWhileLoop();
//        Loops.forLoop();
//        Loops.foreachLoop();
//        Loops.forEachMethod();
        Loops.streams();
    }

}
