package org.example.baseknowlegde;

public class Declarations {
    // properties
    public String name;

    private int counter = 0;

    protected String familySecret;

    // constructor -> optional (default is empty constructor), allows multiple

    public Declarations() {
        System.out.println("empty constructor executed");
        setFamilySecret();
    }

    public Declarations(String name) {
        this.name = name;
        setFamilySecret();
    }

    // method
    public int incrementCounter() {
        return ++counter;
    }

    public String getFamilySecret() {
        return familySecret;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int resetCounter() {
        counter = 0;
        return counter;
    }

    public int resetCounter(int value) {
        counter = value;
        return counter;
    }

    private void setFamilySecret() {
        familySecret = "My magic number is " + Math.round(Math.random() * 100);
    }

    @Override
    public String toString() {
        return "Declarations{" +
                "name='" + name + '\'' +
                ", counter=" + counter +
                ", familySecret='" + familySecret + '\'' +
                '}';
    }
}
