package com.staticExample;

public class Human {
    int age ;
    String name;
    String country;
    int salary;
    boolean isMarried;
    static long population;

    public Human ( int age , String name , String country , int salary , boolean isMarried){
        this.age = age ;
        this.name = name ;
        this.country = country ;
        this.salary = salary;
        this.isMarried = isMarried;
        population += 1;
    }

}
