package com.okushyn.patterns.design.creational.factory_method;

import com.okushyn.patterns.design.creational.factory_method.message.JSONMessage;
import com.okushyn.patterns.design.creational.factory_method.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    Message createMessage() {
        return new JSONMessage();
    }
}