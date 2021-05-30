import java.util.Arrays;

public class Veci {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String x = io.getLine();
        boolean bool = true;
        outerloop:
        for (int i = x.length() - 1; i >= 0; i--) {
            char digitAtI = x.charAt(i);
            for (int j = i - 1; j >= 0; j--) {
                char digitAtJ = x.charAt(j);
                if (digitAtI > digitAtJ) {
                    char[] digits = new char[x.length()];
                    x.getChars(0, digits.length, digits, 0); // method copies content of string into specified char array
                    digits[i] = digitAtJ; // swap places
                    digits[j] = digitAtI; // swap places
                    Arrays.sort(digits, j + 1, digits.length);
                    io.println(String.valueOf(digits));
                    bool = false;
                    break outerloop;
                }
            }
        }
        if (bool == true) {
            io.println("0");
        }
        io.flush();
    }
}