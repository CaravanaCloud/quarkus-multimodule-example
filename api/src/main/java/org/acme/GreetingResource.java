package org.acme;

import java.util.List;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.runtime.StartupEvent;

@Path("/hello")
public class GreetingResource {
    @Inject
    EntityManager em;

    @Transactional
    public void init(@Observes StartupEvent event){
        em.persist(new Greeting("Hello world!"));
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Greeting> hello() {
        return em.createQuery("select g from Greeting g", Greeting.class)
                 .getResultList();
    }
}