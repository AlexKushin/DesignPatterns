package com.okushyn.priciples.solid.dip.fixed;

public interface Formatter {

    public String format(Message message) throws FormatException;

}
