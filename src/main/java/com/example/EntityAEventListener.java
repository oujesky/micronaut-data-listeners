package com.example;

import io.micronaut.data.annotation.event.PrePersist;
import jakarta.inject.Singleton;

@Singleton
public class EntityAEventListener {

    @PrePersist
    void prePersist(EntityA tableA) {
        tableA.setColumnB("VALUE SET FROM TABLE A PRE-PERSIST EVENT LISTENER");
    }

}
