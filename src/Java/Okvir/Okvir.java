import java.util.Scanner;
import java.util.Arrays;

public class Okvir {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int u = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        char[][] input = new char[m][n];
        for (int i = 0; i < m; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                input[i][j] = line.charAt(j);
            }
        }
        int R = m + u + d;
        int C = n + l + r;
        char[][] output = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    output[i][j] = '#';
                } else {
                    output[i][j] = '.';
                }
            }
        }
        for (int i = u; i < R - d; i++) {
            for (int j = l; j < C - r; j++) {
                output[i][j] = input[i - u][j - l];
            }
        }
        for (char[] x : output) {
            for (char c : x) {
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
}