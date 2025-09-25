package org.example.oops.abstraction;

public class Smartphone extends Camera implements Speaker, Wifi {

    static Smartphone smartphone = new Smartphone();

    @Override
    public void clickPicture() {
        smartphone.info();
        System.out.println("Smartphone: Clicks Picture...");
        Speaker.super.info();
        Wifi.super.info();
    }

    public static void main(String[] args) {
        smartphone.clickPicture();
        // Speaker.super.info();
        // This call will not work here,
        // because this is only allowed on the method which are overriding an interface or class
    }

    @Override
    public void playSound() {
        System.out.println("Smartphone: Plays Music");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone: Connect Wifi");
    }

    // IMPORTANT!!!
    // If a class inherits a concrete method from a superclass, it always wins over default methods from interfaces.
    // What’s happening in your code?
    //
    //Camera (abstract class) has a concrete info() method.
    //
    //Speaker and Wifi (interfaces) also declare a default info() method.
    //
    //Your class Smartphone extends Camera and implements Speaker, Wifi.

}
