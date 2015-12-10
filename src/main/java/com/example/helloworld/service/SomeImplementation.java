package com.example.helloworld.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class SomeImplementation implements SomeInterface {
    private final SomeDependency someDependency;

    @Inject
    public SomeImplementation(SomeDependency someDependency) {
        System.out.println("Implementation created");
        this.someDependency = someDependency;
    }

    @Override
    public void foo() {
        System.out.println("Great implementation!");
        System.out.format("Dependency says hello: %d%n", someDependency.doSomething(1, 2));
    }
}
