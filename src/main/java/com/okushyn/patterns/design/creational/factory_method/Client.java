package com.okushyn.patterns.design.creational.factory_method;

import com.okushyn.patterns.design.creational.factory_method.message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.getMessage();
        System.out.println(message);
    }
}