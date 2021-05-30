import java.util.Scanner;
import java.util.Arrays;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            double av = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                av += arr[j];
            }
            av /= n;
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                if (arr[0] == av) {
                    System.out.println("0.000%");
                    break;
                } 
                if (arr[j] > av) {
                    double res = (n - j) / (double) n * 100;
                    System.out.printf("%.3f", res);
                    System.out.print("%\n");
                    break;
                }
            }
        }
    }    
}