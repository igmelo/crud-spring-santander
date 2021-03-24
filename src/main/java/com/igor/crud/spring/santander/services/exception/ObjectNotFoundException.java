package com.igor.crud.spring.santander.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -7323933697665745468L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
