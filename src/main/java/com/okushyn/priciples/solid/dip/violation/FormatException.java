package com.okushyn.priciples.solid.dip.violation;

import java.io.IOException;

public class FormatException extends IOException {

    public FormatException(Exception cause) {
        super(cause);
    }
}

