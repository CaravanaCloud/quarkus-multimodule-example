package org.acme;

import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "greeting", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "picocli",
        description = "Your name.")
    String name;

    @Inject @RestClient
    GreetingClient client;

    @Override
    public void run() {
        System.out.printf("Hello %s, go go commando!\n", name);
        var greetings = client.hello();
        System.out.println("Greetings! "+greetings); 
    }

}
