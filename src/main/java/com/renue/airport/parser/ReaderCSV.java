package com.renue.airport.parser;

import au.com.bytecode.opencsv.CSVReader;
import com.renue.airport.entity.Airport;

import java.io.*;
import java.util.*;

public class ReaderCSV {

    private static String csv_file = "src\\main\\resources\\airports.csv";

    public static void searcher(String args) throws IOException {

        LinkedList<Airport> airports = new LinkedList<>();
        CSVReader reader = new CSVReader(new FileReader(csv_file), ',', '"', 1);
        String[] line;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String data = scanner.next();
        scanner.close();

        boolean bool = false;

        long start = System.nanoTime();

        while ((line = reader.readNext()) != null) {
            if (line != null) {
                if (line[Integer.parseInt(args)].contains(data)) {

                    char[] lineChar = line[Integer.parseInt(args)].toCharArray();
                    char[] dataChar = data.toCharArray();

                    for (int i = 0; i < dataChar.length; i++) {
                        if (dataChar[i] == lineChar[i]) {
                            bool = true;
                        } else {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        Airport airport = new Airport(line[0], line[1], line[2],
                                line[3], line[4], line[5], line[6], line[7],
                                line[8], line[9], line[10], line[11]);
                        airports.add(airport);
                    }
                }
            }
        }

        long end = System.nanoTime();
        long result = (end - start) / 1000000;

        for (Airport airport : airports) {
            System.out.println(airport.getId() + ", " + airport.getTitle() + ", " + airport.getCity() +
                    ", " + airport.getCountry() + ", " + airport.getAbbreviation_city() + ", " + airport.getAbbreviation_country() +
                    ", " + airport.getCoordinates_1() + ", " + airport.getCoordinates_2() + ", " + airport.getType() +
                    ", " + airport.getZone() + ", " + airport.getName() + ", " + airport.getGroup());
        }

        System.out.print("Количество найденных строк: " + airports.size() + ". ");
        System.out.println("Время, затраченное на поиск: " + result + " мс.");
    }

}
