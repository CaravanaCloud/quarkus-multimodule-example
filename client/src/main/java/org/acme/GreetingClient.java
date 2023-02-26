package org.acme;

import java.util.List;

import javax.ws.rs.GET;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "greeting")
public interface GreetingClient {
    @GET
    public List<Greeting> hello(); 
}
