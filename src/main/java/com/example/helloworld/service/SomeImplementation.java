package com.example.helloworld.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class SomeImplementation implements SomeInterface {
    @Inject
    public void SomeImplementation() {
        System.out.println("Created");
    }

    @Override
    public void foo() {
        System.out.println("Great implementation!");
    }
}
