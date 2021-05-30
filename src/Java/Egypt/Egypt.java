import java.util.Scanner;

public class Egypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while (true) {
            line = sc.nextLine();
            String[] numbers = line.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);
            if (a == 0 && b == 0 && c == 0) break;
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}