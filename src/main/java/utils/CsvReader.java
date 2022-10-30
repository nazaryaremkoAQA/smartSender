package utils;

import com.opencsv.bean.*;

import java.io.*;
import java.util.*;

public class CsvReader {

    public List getCsvData(String fileName, String value, Class clazz)   {
        try {
            return new CsvToBeanBuilder<>(new FileReader(fileName))
                    .withType(clazz)
                    .withFilter(id -> id[0].trim().equals(value))
                    .build().parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
