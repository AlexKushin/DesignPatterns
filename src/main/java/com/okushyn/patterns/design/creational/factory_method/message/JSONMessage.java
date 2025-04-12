package com.okushyn.patterns.design.creational.factory_method.message;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }

}
