package com.valikmed.printer.services.impl;

public class ColorPrinterImpl  implements  ColorPrinter{

    private RedPrinter redPrinter;

    public ColorPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
    }

    @Override
    public String print() {
        return String.join(redPrinter.print());
    }
}