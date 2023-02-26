package org.acme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    Long id;

    String message;
    
    public Greeting(){}

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }    
}