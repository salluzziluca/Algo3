package NotacionRomana;

public class NotacionRomana {

    public static String convertir(int n) {
        if (n >= 5) {
            return "V" + "I".repeat(n - 5);
        }
        if (n == 4) {
            return "IV";
        }
        return "I".repeat(n);
    }
}
