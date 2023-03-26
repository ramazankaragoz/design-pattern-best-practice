package com.example.designpattern.demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class StudentComposite implements Student{

    private List<Student> students=new ArrayList<>();

    @Override
    public void showDetails() {
        students.forEach(Student::showDetails);
    }

    public void add(Student student){
        students.add(student);
    }

    public void remove(Student student){
        students.remove(student);
    }
}
