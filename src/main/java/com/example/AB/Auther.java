package com.example.AB;

public class Auther {
    private String name;
    private int age;
    private float rating;

    public Auther(String name, int age, float rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
