package ru.itis.inform;


public class Human {
    private int age;
    private String name;

    public Human (int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return this.age + this.name;
    }
}
