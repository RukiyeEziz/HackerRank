package introduction;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class DateTime {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        System.out.println("Enter month: ");
        int month = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter day: ");
        int day = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter year: ");
        int year = Integer.parseInt(bufferedReader.readLine());

        String res = findDay(month, day, year);
        System.out.println();
        System.out.println( month + " " + day + " " + year + " is " + res);
        bufferedReader.close();
        
    }

}
