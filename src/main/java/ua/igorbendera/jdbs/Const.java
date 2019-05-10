package ua.igorbendera.jdbs;

public class Const {
    //tables
    public static final String PROGRAMMER_TABLE = "programmer";
    public static final String LAPTOP_TABLE = "laptop";

    // PROGRAMMER_TABLE columns
    public static final String PROGRAMMER_ID = "id";
    public static final String PROGRAMMER_NAME = "name";
    public static final String PROGRAMMER_PROG_LANGUAGE = "program_language";
    public static final String PROGRAMMER_COMPANY = "company";
    public static final String PROGRAMMER_AGE = "age";

    // LAPTOP_TABLE columns
    public static final String LAPTOP_ID = "id";
    public static final String LAPTOP_BRAND = "brand";
    public static final String LAPTOP_MODEL = "model";
    public static final String LAPTOP_RAM = "RAM";
    public static final String LAPTOP_PROGRAMMER_ID = "programmer_id";
}
