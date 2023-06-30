package WeekFour.HomeworkFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumOfEachLine {

    public static void main(String[] args) {

        try {
            readFile("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            String[] lineSplitArr = line.split("[\\s+,]");
            String[] stringNumsArr = Arrays.copyOfRange(lineSplitArr, 2, lineSplitArr.length);
            Integer[] integerNumsArr = new Integer[stringNumsArr.length];
            for (int i = 0; i < stringNumsArr.length; i++) {
                int value = Integer.parseInt(stringNumsArr[i]);
                integerNumsArr[i] = value;
            }
            int max = Collections.max(Arrays.asList(integerNumsArr));
            String firstName = lineSplitArr[0];
            String lastName = lineSplitArr[1];
            System.out.println(firstName + " " + lastName + " Max: " + max);
        }
        reader.close();
    }
}
