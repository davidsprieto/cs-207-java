package WeekFive.WorkshopFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SortedIntegerFile {

    public static void main(String[] args) {
        try {
            File file = new File("integers1.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                int previous = reader.nextInt();
                int current = reader.nextInt();
                if (current < 0) {
                    throw new InputMismatchException();
                }
                if (current != previous + 1) {
                    throw new Exception("File not sorted. \n" + previous + " occurs before " + current);
                }
            }
            System.out.println("File is sorted.");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }  catch (InputMismatchException e) {
            System.out.println("File contains values other than positive integers.");
        } catch (NoSuchElementException e) {
            System.out.println("File is sorted.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
