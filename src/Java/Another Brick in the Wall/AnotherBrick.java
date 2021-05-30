import java.util.Scanner;

public class AnotherBrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int temp = w;
        int[] arr = new int[h];
        for (int i = 0; i < h; i++) {   
            arr[i] = temp;
            temp += w;
        }
        int current = 0;
        int[] acc = new int[n];
        for (int i = 0; i < n; i++) {
            current += sc.nextInt();
            acc[i] = current;
        }
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                if (acc[j] == arr[i]) {
                    count++;
                    break;
                }
            }
        }
        if (count == h) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}