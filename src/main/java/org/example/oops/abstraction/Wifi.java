package org.example.oops.abstraction;

public interface Wifi {

    void connect();

    default void info() {
        System.out.println("Provides Internet Connection");
    }

}
