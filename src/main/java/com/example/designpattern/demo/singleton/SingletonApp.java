package com.example.designpattern.demo.singleton;

import com.example.designpattern.demo.DemoApplication;
import org.springframework.boot.SpringApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ramazan Karagöz
 * @date 9/4/2019
 */

public class SingletonApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        usingSingletonNormalize();
        //usingSingletonWithReflection();
        /*try {
            usingSingletonWithDeserialization();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

       /* try {
            usingSingletonWithClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/


    }


    public static void usingSingletonNormalize(){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println("s1 object hashcode: "+s1.hashCode());
        System.out.println("s2 object hashcode: "+s2.hashCode());
    }

    /**
     * Reflection ile instance oluşturulduğunda iki farklı obje oluşturuyor
     * Çözüm olarak Sİngleton sınıfı içerisinde exception fırlatabiliriz.
     */
    public static void usingSingletonWithReflection(){
        Singleton s1=Singleton.getInstance();
        Singleton s2=null;

        try {
            Constructor constructor =Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            s2= (Singleton) constructor.newInstance();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }finally {
            System.out.println("s1 object hashcode: "+s1.hashCode());
            System.out.println("s2 object hashcode: "+s2.hashCode());
        }
    }

    /**
     * Singleton sınıfında deserialization yapıldığında iki farklı obje oluşturuyor.
     * çözüm olarak readResolve() methodunu ovverride edebiliriz.Ve dönüş tipini Singleton instance yapabiliriz.
     * @throws Exception
     */
    public static void usingSingletonWithDeserialization() throws Exception{
        Singleton s1 = Singleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(s1);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        Singleton s2 = (Singleton) in.readObject();
        in.close();
        System.out.println("s1 object hashcode: "+s1.hashCode());
        System.out.println("s2 object hashcode: "+s2.hashCode());
    }


    /**
     * Singleton sınıfından oluşturulan objeyi clone yapıldığı zaman iki farklı hashcode olan nesne oluşturuyor.
     * Bunu önlemek için Singleton sınıfında clone methodunu ovveride edip içerinde exception atabiliriz.
     * @throws CloneNotSupportedException
     */
    public static void usingSingletonWithClone() throws CloneNotSupportedException {
        Singleton s1=Singleton.getInstance();
        Singleton s2= (Singleton) s1.clone();
        System.out.println("s1 object hashcode: "+s1.hashCode());
        System.out.println("s2 object hashcode: "+s2.hashCode());
    }
}
