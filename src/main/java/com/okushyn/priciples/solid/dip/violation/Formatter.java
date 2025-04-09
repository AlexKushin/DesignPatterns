package com.okushyn.priciples.solid.dip.violation;

public interface Formatter {

    public String format(Message message) throws FormatException;

}
