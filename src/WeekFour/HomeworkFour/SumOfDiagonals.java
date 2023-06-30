package WeekFour.HomeworkFour;

public class SumOfDiagonals {
    public static void main(String[] args) {

        String[][] s1 = {{"2", "3", "4"},
                {"5", "6", "7"},
                {"8", "9", "10"}};

        String[][] s2 = {{"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"13", "14", "15"}};

        String[][] s3 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "pp"}};

        String[][] s4 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            sumOfDiagonals(s1);
            sumOfDiagonals(s2);
            sumOfDiagonals(s3);
            sumOfDiagonals(s4);
        } catch (NumberFormatException e) {
            System.out.println("Not a valid integer");
        } catch (IllegalArgumentException e) {
            System.out.println("Array not a square");
        }
        System.out.println("Continue execution");
    }

    public static void sumOfDiagonals(String[][] x) {
        int sum = 0;
        int index = 0;
        int vLength = x.length;
        int hLength = x[0].length;

        if (vLength != hLength) {
            throw new IllegalArgumentException();
        }

        while (index < vLength) {
            int value = Integer.parseInt(x[index][index]);
            sum += value;
            index++;
        }

        System.out.println(sum);
    }
}
