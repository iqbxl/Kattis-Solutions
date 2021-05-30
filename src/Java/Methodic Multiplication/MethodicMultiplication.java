import java.util.Scanner;
import java.util.Arrays;

public class MethodicMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.next().split("\\(");
        String[] y = sc.next().split("\\(");
        int xlen = x.length - 1;
        int ylen = y.length - 1;
        if (xlen == 0 || ylen == 0) {
            System.out.println(0);
        } else {
            String[] front = new String[xlen * ylen];
            char[] back = new char[xlen * ylen];
            Arrays.fill(front, "S("); // Avoid using for loop, will result in time limit exceeded
            Arrays.fill(back, ')');
            for (String s : front) {
                System.out.print(s);
            }
            System.out.print("0" + new String(back));
        }
    }
}