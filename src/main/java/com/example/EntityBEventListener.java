package com.example;

import io.micronaut.data.annotation.event.PrePersist;
import jakarta.inject.Singleton;

@Singleton
public class EntityBEventListener {

    @PrePersist
    void prePersist(EntityB tableB) {
        tableB.setColumnB("VALUE SET FROM TABLE A PRE-PERSIST EVENT LISTENER");
    }

}
