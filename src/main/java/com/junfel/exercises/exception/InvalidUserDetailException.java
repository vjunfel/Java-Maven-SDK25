package com.junfel.exercises.exception;

public class InvalidUserDetailException extends Exception {
    private long serialVersionUID = 1l;

    public InvalidUserDetailException(String message) {
        super(message);
    }
}
