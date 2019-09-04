package com.example.designpattern.demo.exception;

/**
 * @author Ramazan Karagöz
 * @date 9/4/2019
 */

public class AlreadyExistException extends RuntimeException {

    private String msg="Already exist!";

    public AlreadyExistException(String msg){
        super(msg);
    }
}
