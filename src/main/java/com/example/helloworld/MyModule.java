package com.example.helloworld;

import com.example.helloworld.service.SomeDependency;
import com.example.helloworld.service.SomeDependencyImplementation;
import com.example.helloworld.service.SomeImplementation;
import com.example.helloworld.service.SomeInterface;
import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SomeDependency.class).to(SomeDependencyImplementation.class);
        bind(SomeInterface.class).to(SomeImplementation.class).asEagerSingleton();
    }
}
