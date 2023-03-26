package com.example.designpattern.demo.creational.singleton;

import com.example.designpattern.demo.exception.AlreadyExistException;

import java.io.Serializable;

/**
 * @author Ramazan Karagöz
 * @date 9/4/2019
 */

public class Singleton implements Serializable {

    private static Singleton instance=null;

    public Singleton() {

        if (instance!=null){
            throw new AlreadyExistException("This instance already exist!");
        }
    }


    public static Singleton getInstance() {

        if (instance==null){
            synchronized (Singleton.class){

                instance=new Singleton();

            }
        }

        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }
}
