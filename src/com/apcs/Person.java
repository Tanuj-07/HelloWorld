package com.apcs;

import java.sql.SQLOutput;
import java.util.SortedMap;

import static java.lang.System.exit;

public class Person {

    private int age;
    private String name;
    private int height;

    public Person(int a, String n, int h){
        age = a;
        name = n;
        height = h;
    }
    public void getPerson(){
        System.out.println(name + " with a height of " + height + " at age " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public static void main(String... args){
        Person p1 = new Person(15, "tanuj",67);
        System.out.println(p1);
        System.out.println(p1.toString());
        p1.getPerson();

    }
}

