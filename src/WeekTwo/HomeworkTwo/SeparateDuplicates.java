package WeekTwo.HomeworkTwo;

public class SeparateDuplicates {

    public static String separateDuplicateChars(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);

            if (i == str.length() - 1) {
                newStr += c1;
                break;
            }

            char c2 = str.charAt(i + 1);

            if (c1 == c2) {
                newStr += c1 + "-" + c2;
                i++;
            } else {
                newStr += c1;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(separateDuplicateChars("Hello"));
        System.out.println(separateDuplicateChars("Bookkeeper"));
        System.out.println(separateDuplicateChars("Yellowwood door"));
        System.out.println(separateDuplicateChars("Chicago Cubs"));

    }

}
