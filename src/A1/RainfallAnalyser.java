package A1;

import textio.TextIO;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;


public class RainfallAnalyser {
    private static final int IDX_YEAR = 2;
    private static final int IND_MONTH = 3;
    private static final int IND_DAY = 4;
    private static final int IND_RAIN = 5;
    private static final int NUM_MONTHS = 12;
    private static final int NUM_DAYS = 31;
    private static final double EMPTY_RAIN_VAL = -0.001;


    public static void main(String[] args) throws IOException {
        System.out.println("A1");
        System.out.println("\n ************** Part A ************ \n ");
        try {
            System.out.println("Enter path");
            String pathFile = TextIO.getln();
            TextIO.readFile(pathFile);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Failed to process file");
        }

    }
}
