package com.mycompany.app;

import lombok.Getter;

@Getter

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s:  %d", name, age);
    }
}
