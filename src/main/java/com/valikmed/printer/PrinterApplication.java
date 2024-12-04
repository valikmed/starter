package com.valikmed.printer;

import com.valikmed.printer.services.impl.ColorPrinter;
import com.valikmed.printer.services.impl.ColorPrinterImpl;
import com.valikmed.printer.services.impl.EnglishRedPrinter;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PrinterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PrinterApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        final ColorPrinter colorPrinter = new ColorPrinterImpl();
        log.info(colorPrinter.print());
    }
}