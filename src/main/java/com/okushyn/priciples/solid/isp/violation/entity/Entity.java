package com.okushyn.priciples.solid.isp.violation.entity;

//Base class for all entities
public abstract class Entity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}