package com.example.helloworld;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    private String environment = "local";

    public String getEnvironment() {
        return environment;
    }
}
