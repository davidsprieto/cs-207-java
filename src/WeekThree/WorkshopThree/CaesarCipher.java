package WeekThree.WorkshopThree;

public class CaesarCipher {

    public static String encrypt(String s, int d) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                int shift = (c - 'a' + d) % 26;
                ans.append((char) ('a' + shift));
            } else {
                ans.append(c);
            }

        }
        System.out.print(s + " encrypted is ");
        return ans.toString();
    }

    public static String decrypt(String s, int d) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                int shift = ('z' - c + d) % 26;
                ans.append((char) ('z' - shift));
            } else {
                ans.append(c);
            }
        }
        System.out.print(s + " decrypted is ");
        return ans.toString();
    }

}
