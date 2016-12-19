package com.daria.university.kursovaya.service;


import java.util.ArrayList;
import java.util.List;

public class StringsGenerator {
    //make it size of 10
    public static final List<String> stringsForCode = getCodeStrings();
    public static final List<String> stringsForDB = getDBStrings();
    private static List<String> getCodeStrings(){
        List<String> result = new ArrayList<String>();
        result.add("System.out.println(\"Hello World\");");
        result.add("int [] numbers = {10, 20, 30, 40, 50};");
        result.add(" public static void main(String args[])");
        result.add(" for(int x : numbers ) {\n" +
                "         System.out.print( x );\n" +
                "         System.out.print(\",\");\n" +
                "      }");
        result.add("int len = palindrome.length();");
        result.add("GregorianCalendar gcalendar = new GregorianCalendar();");
        result.add("if(gcalendar.isLeapYear(year)) {\n" +
                "         System.out.println(\"The current year is a leap year\");\n" +
                "      }");
        result.add("else {\n" +
                "         System.out.println(\"The current year is not a leap year\");\n" +
                "      }");
        result.add("public class Salary extends Employee { \n }");
        result.add("public double computePay() {\n" +
                "      System.out.println(\"Computing salary pay for \" + getName());\n" +
                "      return salary/52;\n" +
                "   }");
        return result;
    }

    private static List<String> getDBStrings(){
        List<String> result = new ArrayList<String>();
        result.add("CREATE TABLE products (\n" +
                "    product_no integer,\n" +
                "    name text,\n" +
                "    price numeric\n" +
                ");");
        result.add("DROP TABLE my_first_table;\n" +
                "DROP TABLE products;");
        result.add("ALTER TABLE products ADD CHECK (name <> '');");
        result.add("ALTER TABLE products RENAME COLUMN product_no TO product_number;");
        result.add("INSERT INTO products VALUES (1, 'Cheese', 9.99);");
        result.add("INSERT INTO products (product_no, name, price) VALUES (1, 'Cheese', 9.99);");
        result.add("INSERT INTO products DEFAULT VALUES;");
        result.add("UPDATE products SET price = price * 1.10;");
        return result;
    }
}
