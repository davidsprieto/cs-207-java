package WeekThree.WorkshopThree;

public class Decimals {

    public static void printDecimalDigits(double num) {
        String ans = String.valueOf(num);
        int indexOfPeriod = ans.indexOf('.');
        ans = ans.substring(indexOfPeriod + 1);
        System.out.println("Digits after decimal point: " + ans);
    }

}
