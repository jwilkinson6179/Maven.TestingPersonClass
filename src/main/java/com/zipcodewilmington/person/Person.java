package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int startingAge) {
        this.age = startingAge;
    }

    public Person(String inputName) {
        this.name = inputName;
    }

    public Person(String inputName, int startingAge) {
        this.name = inputName;
        this.age = startingAge;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
