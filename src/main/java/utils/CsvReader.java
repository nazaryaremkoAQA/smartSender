package utils;

import com.opencsv.bean.*;
import pojo.*;

import java.io.*;
import java.util.*;

public class CsvReader {


    public static List<ContactData> getContactData(String fileName, String value)   {
        try {
            return  new CsvToBeanBuilder<ContactData>(new FileReader(fileName))
                    .withType(ContactData.class)
                    .withFilter(id -> id[0].equals(value))
                    .build().parse();
        } catch (FileNotFoundException e) {
            return null;
        }
     }

     public static List<Contact> getContact(String fileName, String value)   {
        try {
            return  new CsvToBeanBuilder<Contact>(new FileReader(fileName))
                    .withType(Contact.class)
                    .withIgnoreEmptyLine(true)
                    .withFilter(id -> id[0].equals(value))
                    .build().parse();
        } catch (FileNotFoundException e) {
            return null;
        }
     }

    public static List<Contact.Variables> getVariables(String fileName, String value)   {
        try {
            return  new CsvToBeanBuilder<Contact.Variables>(new FileReader(fileName))
                    .withType(Contact.Variables.class)
                    .withFilter(id -> id[0].contains(value))
                    .build().parse();
        } catch (FileNotFoundException e) {
            return null;
        }
    }
    public static List<Contact.Cac> getCacCSV(String fileName, String value)   {
        try {
            return  new CsvToBeanBuilder<Contact.Cac>(new FileReader(fileName))
                    .withType(Contact.Cac.class)
                    .withFilter(id -> id[0].equals(value))
                    .build().parse();
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
