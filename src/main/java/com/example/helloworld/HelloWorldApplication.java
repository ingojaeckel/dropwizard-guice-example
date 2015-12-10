package com.example.helloworld;

import com.example.helloworld.health.TemplateHealthCheck;
import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        GuiceBundle<HelloWorldConfiguration> guiceBundle = GuiceBundle.<HelloWorldConfiguration>newBuilder()
                .addModule(new MyModule())
                .enableAutoConfig(getClass().getPackage().getName())
                .setConfigClass(HelloWorldConfiguration.class)
                .build();

        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public String getName() {
        return "guice-hello-world-example";
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {
        environment.healthChecks().register("template", new TemplateHealthCheck());
    }
}
