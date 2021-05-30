import java.util.Scanner;

public class CarefulAscent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        double shieldSum = 0;
        while (n-- > 0) {
            int l = sc.nextInt();
            int u = sc.nextInt();
            double f = sc.nextDouble();
            shieldSum += (u - l) * f;
            y -= u - l;
        }
        System.out.print(x / (shieldSum + y));
        sc.close();
    }
}