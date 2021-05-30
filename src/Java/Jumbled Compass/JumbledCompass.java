import java.util.Scanner;

public class JumbledCompass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int diff = n2 - n1;
        if (diff > 180) {
            diff -= 360;
        } else if (diff < -180) {
            diff += 360;
        } else if (diff == -180) {
            diff = 180;
        }
        System.out.println(diff);
        sc.close();
    }
}