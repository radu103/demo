package com.example.demo.service;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SingletonObject {
    
    private static SingletonObject instance = null;

    public static SingletonObject getInstance() {
        if(instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }
}
