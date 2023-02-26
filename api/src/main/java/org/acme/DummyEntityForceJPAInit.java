package org.acme;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DummyEntityForceJPAInit {
    @Id
    Long id;
}
