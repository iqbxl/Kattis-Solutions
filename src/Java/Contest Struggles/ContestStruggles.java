import java.util.Scanner;

public class ContestStruggles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int k = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();
        double res = (n * d - k * s) / (n - k);
        System.out.println(res > 100 || res < 0 ? "impossible" : res);
        sc.close();
    }
}