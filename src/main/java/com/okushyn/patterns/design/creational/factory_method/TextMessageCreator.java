package com.okushyn.patterns.design.creational.factory_method;

import com.okushyn.patterns.design.creational.factory_method.message.Message;
import com.okushyn.patterns.design.creational.factory_method.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    Message createMessage() {
        return new TextMessage();
    }
}
