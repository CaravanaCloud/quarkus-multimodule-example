package org.acme;

import java.util.Map;

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

    public Greeting(String message){
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String toString(){
        return String.format("%s:%s", id, message);
    }
    
}