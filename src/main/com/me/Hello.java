package com.me;

public class Hello {

    String name;

    int id;

    public Hello(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        Hello hello = new Hello("John", 1);
        System.out.println("Hello "+hello.name);
    }
}
