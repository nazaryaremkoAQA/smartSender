package common;

import java.io.*;

public class Constants {

    public static final String SRC_TEST_JAVA = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java" +
            File.separator + "feature";

    private static final String CSV_FILES = System.getProperty("user.dir") + File.separator + "src" + File.separator +
            "main" + File.separator + "java" + File.separator + "csv_data" + File.separator;
    public static final String CSV_CONTACT_DATA = CSV_FILES + "contact_data.csv";
    public static final String CSV_CONTACT = CSV_FILES + "contact.csv";
    public static final String CSV_VARIABLES = CSV_FILES + "variables.csv";
    public static final String CSV_CAC = CSV_FILES + "cac.csv";
}
