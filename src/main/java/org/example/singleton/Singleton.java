package org.example.singleton;

public class Singleton {
    private int id;
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            int randomId = (int) Math.round(Math.random() * 10);
            instance.setId(randomId);
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
}
