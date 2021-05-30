import java.util.Scanner;

public class SocialRunning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(arr[i % n] + arr[(i + n - 2) % n], min); // First and second last always alone
        }
        System.out.print(min);
        sc.close();
    }    
}