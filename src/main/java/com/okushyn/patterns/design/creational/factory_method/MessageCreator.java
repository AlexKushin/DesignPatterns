package com.okushyn.patterns.design.creational.factory_method;

import com.okushyn.patterns.design.creational.factory_method.message.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    abstract Message createMessage();
}
