package WeekTwo.HomeworkTwo;

public class Reverse {

    public static boolean isExactReverse(String x, String y) {
        StringBuilder reversed = new StringBuilder();

        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            reversed.append(c);
        }
        String xReversed = reversed.toString();
        return xReversed.equals(y);
    }

    public static void main(String[] args) {
        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));
    }

}
