package WeekFive.WorkshopFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PerfectDivision {

    public static void main(String[] args) {
        try {
            File file = new File("data1.txt");
            Scanner reader = new Scanner(file);
            String line = reader.nextLine();
            int divisor = reader.nextInt();
            String[] lineSplit = line.split("[\\s+]");
            for (String s : lineSplit) {
                int value = Integer.parseInt(s);
                int remainder = value % divisor;
                if (remainder != 0) {
                    throw new Exception("List of integers is not perfectly divisible by divisor. \n"
                    + value + " is not perfectly divisible by " + divisor + ".");
                }
            }
            System.out.println("List of integers is perfectly divisible by " + divisor + ".");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NumberFormatException e) {
            System.out.println("List of integers contains values other than integers.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
