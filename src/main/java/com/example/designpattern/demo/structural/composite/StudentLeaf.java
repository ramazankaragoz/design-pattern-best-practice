package com.example.designpattern.demo.structural.composite;

//Leaf 1 Class
public class StudentLeaf implements Student {

    private String name;
    private int age;

    public StudentLeaf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void showDetails() {
        System.out.println("Student name: "+name+", Age: "+age);
    }
}
