import java.util.Scanner;

public class ForcedChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int p = sc.nextInt();
        int s = sc.nextInt();
        
        for (int i = 0; i < s; i++) {
            int m = sc.nextInt();
            boolean check = false;
            for (int j = 0; j < m; j++) {
                if (sc.nextInt() == p) {
                    check = true;
                }
            }
            System.out.println(check ? "KEEP" : "REMOVE");
        }
    }
}