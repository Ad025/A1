package A1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// TODO: you must use TextIO in your solution to read from the data files

public class RainfallAnalyser {
    public static void main(String[] args) throws IOException {
        System.out.println("A1");

        String pathFile = "src\\IDCJAC0009_031205_1800_Data.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathFile));
        String row;
//        int arr[][] ;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while ((row = csvReader.readLine()) != null) {
//            System.out.println(row);
            String[] data = row.split(",");

            String year = data[2];
            System.out.println(year);
            int intYear = Integer.parseInt(year);
            System.out.println(intYear);

        }
        csvReader.close();
        // TODO: add your solution code here
    }

    // TODO: consider using static methods
}
