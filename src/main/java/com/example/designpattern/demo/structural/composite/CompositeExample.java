package com.example.designpattern.demo.structural.composite;

public class CompositeExample {

    public static void main(String[] args) {
        Student s1=new StudentLeaf("Ramazan",21);
        Student s2=new StudentLeaf("Özge",20);

        StudentComposite composite=new StudentComposite();
        composite.add(s1);
        composite.add(s2);

        Student s3=new StudentLeaf("Elmas",23);
        StudentComposite composite2=new StudentComposite();
        composite2.add(s3);

        composite.add(composite2);

        composite.showDetails();

    }
}
