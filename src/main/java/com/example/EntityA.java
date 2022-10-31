package com.example;

import io.micronaut.data.annotation.AutoPopulated;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.validation.constraints.Null;

@MappedEntity("table_a")
public class EntityA {

    @Id
    @AutoPopulated
    @GeneratedValue
    private Long id;

    private String columnA;

    private String columnB;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumnA() {
        return columnA;
    }

    public void setColumnA(String columnA) {
        this.columnA = columnA;
    }

    public String getColumnB() {
        return columnB;
    }

    public void setColumnB(String columnB) {
        this.columnB = columnB;
    }

    @Override
    public String toString() {
        return "EntityA{" +
               "id=" + id +
               ", columnA='" + columnA + '\'' +
               ", columnB='" + columnB + '\'' +
               '}';
    }
}
