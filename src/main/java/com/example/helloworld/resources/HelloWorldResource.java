package com.example.helloworld.resources;

import com.example.helloworld.api.Saying;
import com.example.helloworld.service.SomeInterface;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
@Singleton
public class HelloWorldResource {
    private final SomeInterface someInterface;

    @Inject
    public HelloWorldResource(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    @GET
    public Saying sayHello() {
        someInterface.foo();
        return new Saying(0, "Hello World!");
    }
}
