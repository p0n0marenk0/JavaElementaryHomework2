package com.p0n0marenk0;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
