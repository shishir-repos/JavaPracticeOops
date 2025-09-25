package org.example.oops.abstraction;

public interface Speaker {

    void playSound();

    default void info() {
        System.out.println("Speaker Plays Alert Sounds");
    }

    default void info2() {
        System.out.println("Speaker Plays Music");
    }

}
