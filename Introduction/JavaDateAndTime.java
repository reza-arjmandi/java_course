import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
        // return LocalDate.of(year, month, day).getDayOfWeek().name();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        return calendar.getDisplayName(
            Calendar.DAY_OF_WEEK, 
            Calendar.LONG, 
            Locale.getDefault()).toUpperCase();
    }

}

public class JavaDateAndTime {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
            new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll(
            "\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}