import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        double max = 0;
        double min = 0;
        for (int i = 0; i < k; i++) {
            sum += sc.nextInt();
        }
        max = sum;
        min = sum;
        for (int i = 0; i < n - k; i++) {
            max += 3;
            min -= 3;
        }
        System.out.print(min / n + " " + max / n);
        sc.close();
    }
}