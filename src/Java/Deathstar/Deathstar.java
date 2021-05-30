import java.util.Scanner;

public class Deathstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = 0;
            for (int j = 0; j < n; j++) {
                num |= sc.nextInt();
            }
            System.out.print(num + " ");
        }
        sc.close();
    }
}