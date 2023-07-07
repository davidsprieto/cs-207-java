package WeekSix.HomeworkSix;

import java.util.Scanner;

public class RecursiveMethods {

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{0, 0, 2, 3, 4, 5, 6};
        int[] array3 = new int[]{};
        int[] array4 = new int[]{2, 3, 4, 11};

        // Testing oddEvenMatchRec:
        System.out.println(oddEvenMatchRec(array1, 0));
        System.out.println(oddEvenMatchRec(array2, 0));
        System.out.println(oddEvenMatchRec(array3, 0));
        System.out.println(oddEvenMatchRec(array4, 0));

        // Testing sumNRec:
        System.out.println(sumNRec(array1, 0));
        System.out.println(sumNRec(array2, 0));
        System.out.println(sumNRec(array3, 0));
        System.out.println(sumNRec(array4, 0));

        // Testing nDownToOne:
        nDownToOne(2);
        nDownToOne(3);
        nDownToOne(4);

        // Testing inputAndPrintReverse:
        inputAndPrintReverse();
    }

    public static boolean oddEvenMatchRec(int[] arr, int index) {
        if (arr.length == 0) {
            return false;
        }
        if (arr.length == index) {
            return true;
        }
        if (index % 2 == 0 && arr[index] % 2 != 0) {
            return false;
        }
        if (index % 2 == 1 && arr[index] % 2 != 1) {
            return false;
        }
        return oddEvenMatchRec(arr, index + 1);
    }

    public static int sumNRec(int[] A, int index) {
        if (index >= A.length) {
            return 0;
        }
        return A[index] + sumNRec(A, index + 1);
    }

    public static void nDownToOne(int n) {
        if (n >= 1) {
            System.out.println(n);
            nDownToOne(n - 1);
        }
    }

    public static void inputAndPrintReverse() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a number (enter 0 to quit): ");
        int userInput = kbd.nextInt();

        if (userInput != 0) {
            inputAndPrintReverse();
            System.out.println(userInput);
        }
    }
}
