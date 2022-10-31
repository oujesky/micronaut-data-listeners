package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

@MicronautTest
class MicronautDataListenersTest {

    @Inject
    private EntityARepository entityARepository;

    @Inject
    private EntityBRepository entityBRepository;

    @Test
    void test() {
        var entityA = new EntityA();
        entityA.setColumnA("column A");
        entityARepository.save(entityA);

        var entityB = new EntityB();
        entityB.setColumnA("column A");
        entityBRepository.save(entityB);

        Assertions.assertEquals("VALUE SET FROM TABLE A PRE-PERSIST EVENT LISTENER", entityA.getColumnB());
        Assertions.assertEquals("VALUE SET FROM TABLE B PRE-PERSIST EVENT LISTENER", entityB.getColumnB());
    }

}
