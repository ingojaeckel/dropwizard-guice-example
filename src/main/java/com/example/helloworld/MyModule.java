package com.example.helloworld;

import com.example.helloworld.service.SomeImplementation;
import com.example.helloworld.service.SomeInterface;
import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SomeInterface.class).to(SomeImplementation.class).asEagerSingleton();
    }
}
