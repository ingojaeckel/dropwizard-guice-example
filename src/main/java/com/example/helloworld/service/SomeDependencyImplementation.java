package com.example.helloworld.service;

import com.google.inject.Singleton;

@Singleton
public class SomeDependencyImplementation implements SomeDependency {
    public SomeDependencyImplementation() {
        System.out.println("Dependency created");
    }

    @Override
    public int doSomething(int a, int b) {
        return a + b;
    }
}
