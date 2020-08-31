package A1;

import textio.TextIO;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;


public class MainA1{
    private static final int IDX_YEAR = 2;
    private static final int IND_MONTH = 3;
    private static final int IND_DAY = 4;
    private static final int IND_RAIN = 5;
    private static final int NUM_MONTHS = 12;
    private static final int NUM_DAYS = 31;


    public static void main(String[] args)
            throws IOException {
        System.out.println("A1");
        System.out.println("\n ************** Part A ************ \n ");


//        String pathFile = "src\\A1\\MountSheridanStationCNS.csv";
        System.out.println("Enter path name:");
        String pathFile = TextIO.getln();
//        BufferedReader csvReader = new BufferedReader(new FileReader(pathFile));

        TextIO.readFile(pathFile);





        String row;

        int count = -1;
        double[][] rainDaily = new double[NUM_MONTHS][NUM_DAYS];
        while (!TextIO.eof()) {
            row = TextIO.getln();
            count++;
            if (count < 1)
                continue;

            String[] data = row.split(",");

            String str = data[IDX_YEAR];
            int year = Integer.parseInt(str);

            str = data[IND_MONTH];
            int month = Integer.parseInt(str);

            str = data[IND_DAY];
            int day = Integer.parseInt(str);

            double rain = 0;
            if (data.length > IND_RAIN) {
                str = data[IND_RAIN];
                rain = Double.parseDouble(str);

            }

            int month_idx = month - 1;
            int day_idx = day - 1;

            double oldVal = rainDaily[month_idx][day_idx];
            double newVal = oldVal + rain;
            rainDaily[month_idx][day_idx] = newVal;

            System.out.printf("Year= %1s, Month= %1s, Day= %1s Rain= %1s :--: OldValue=%.2f, NewValue=%.2f \n", year, month, day, rain, oldVal, newVal);
        }

        System.out.println("\n ************** Part B ************ \n ");

        double[] rainMonthly = new double[NUM_MONTHS];
        double[] dailyMax = new double[NUM_MONTHS];
        double[] dailyMin = new double[NUM_MONTHS];
        for (int m = 0; m < NUM_MONTHS; m++) {
            var monthTotal = 0.;
            var maxDay = Double.MIN_VALUE;
            var minDay = Double.MAX_VALUE;
            for (int d = 0; d < NUM_DAYS; d++) {
                monthTotal += rainDaily[m][d];
                var rain = rainDaily[m][d];
                monthTotal += rain;
                if (maxDay < rain) {
                    maxDay = rain;
                }
                if (minDay > rain) {
                    minDay = rain;
                }
            }
            rainMonthly[m] = monthTotal;
            dailyMax[m] = maxDay;
            dailyMin[m] = minDay;

//            System.out.println("monthTotal=" + monthTotal + ", min=" + minDay + " " + "max=" + maxDay);

            System.out.printf("monthtotal= %.2f, Min= %.2f, Max= %.2f \n", monthTotal, minDay, maxDay);


        }
////        csvReader.close();
        // TODO: add your solution code here


// TODO: consider using static methods


    }

}