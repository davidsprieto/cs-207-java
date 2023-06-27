package WeekThree.WorkshopThree;

public class CaesarCipherTest {

    public static void main(String[] args) {
        // Testing encrypt
        System.out.println(CaesarCipher.encrypt("abc", 1));
        System.out.println(CaesarCipher.encrypt("abc", 25));
        System.out.println(CaesarCipher.encrypt("abc", 50));
        System.out.println(CaesarCipher.encrypt("attack at dawn", 17));

        // Testing decrypt
        System.out.println(CaesarCipher.decrypt("bcd", 1));
        System.out.println(CaesarCipher.decrypt("zab", 25));
        System.out.println(CaesarCipher.decrypt("yza", 50));
        System.out.println(CaesarCipher.decrypt("rkkrtb rk urne", 17));
    }

}
