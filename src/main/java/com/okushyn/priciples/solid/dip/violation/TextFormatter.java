package com.okushyn.priciples.solid.dip.violation;

public class TextFormatter implements Formatter {

    public String format(Message message) {
        return message.getTimestamp() + ":" + message.getMsg();
    }
}
