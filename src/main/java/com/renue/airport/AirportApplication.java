package com.renue.airport;

import com.renue.airport.parser.ReaderCSV;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class AirportApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AirportApplication.class, args);
    }

    @Override
    public void run(String... args) throws IOException {
        String properties_file = "src\\main\\resources\\application.properties";
        Properties applicationProperties = new Properties();
        applicationProperties.load(new FileInputStream(properties_file));
        String column = applicationProperties.getProperty("column");
        ReaderCSV.searcher(column);
    }
}


