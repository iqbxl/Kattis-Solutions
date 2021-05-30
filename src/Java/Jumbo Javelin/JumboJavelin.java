import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 0;
        while (n-- > 0) {
            len += sc.nextInt() - 1;
        }
        System.out.println(len + 1);
        sc.close();
    }
}