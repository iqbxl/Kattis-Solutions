import java.util.Scanner;

public class Kleptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        String plain = new StringBuilder(sc.next()).reverse().toString();
        char[] ciphertext = new StringBuilder(sc.next()).reverse().toString().toCharArray();

        int[] key = new int[m]; // initialized to 0 by default

        for (int i = 0; i < n; i++) {
            key[i] = (((int) ciphertext[i] - (int) plain.charAt(i)) + 26) % 26 + 97; // Cast char as int for ascii
            ciphertext[i] = plain.charAt(i);
        }

        for (int i = n; i < m; i++) {
            key[i] = (((int) ciphertext[i] - key[i - n]) + 26) % 26 + 97;
            ciphertext[i] = (char) key[i - n];
        }

        for (int i = m - 1; i >= 0; i--) {
            System.out.print(ciphertext[i]);
        }
        sc.close();
    }
}