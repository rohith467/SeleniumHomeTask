package com.epam.seleniumtask.exception;

public class NotADefaultBrowserException extends RuntimeException{
    public NotADefaultBrowserException(String browser){
        super("This is not a default browser:- "+browser);
    }
}
