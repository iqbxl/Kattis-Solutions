import java.util.Scanner;

public class DamagedEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        boolean status = false;
        if (a * b == c * d) {
            System.out.println(a + " * " + b + " = " + c + " * " + d);
            status = true;
        }
        if (a * b == c + d) {
            System.out.println(a + " * " + b + " = " + c + " + " + d);
            status = true;
        }
        if (a * b == c - d) {
            System.out.println(a + " * " + b + " = " + c + " - " + d);
            status = true;
        }
        if (d != 0 && a * b == c / d) {
            System.out.println(a + " * " + b + " = " + c + " / " + d);
            status = true;
        }
        if (a + b == c * d) {
            System.out.println(a + " + " + b + " = " + c + " * " + d);
            status = true;
        }
        if (a + b == c + d) {
            System.out.println(a + " + " + b + " = " + c + " + " + d);
            status = true;
        }
        if (a + b == c - d) {
            System.out.println(a + " + " + b + " = " + c + " - " + d);
            status = true;
        }
        if (d != 0 && a + b == c / d) {
            System.out.println(a + " + " + b + " = " + c + " / " + d);
            status = true;
        }
        if (a - b == c * d) {
            System.out.println(a + " - " + b + " = " + c + " * " + d);
            status = true;
        }
        if (a - b == c + d) {
            System.out.println(a + " - " + b + " = " + c + " + " + d);
            status = true;
        }
        if (a - b == c - d) {
            System.out.println(a + " - " + b + " = " + c + " - " + d);
            status = true;
        }
        if (d != 0 && a - b == c / d) {
            System.out.println(a + " - " + b + " = " + c + " / " + d);
            status = true;
        }
        if (b != 0 && a / b == c * d) {
            System.out.println(a + " / " + b + " = " + c + " * " + d);
            status = true;
        }
        if (b != 0 && a / b == c + d) {
            System.out.println(a + " / " + b + " = " + c + " + " + d);
            status = true;
        }
        if (b != 0 && a / b == c - d) {
            System.out.println(a + " / " + b + " = " + c + " - " + d);
            status = true;
        }
        if (b != 0 && d != 0 && a / b == c / d) {
            System.out.println(a + " / " + b + " = " + c + " / " + d);
            status = true;
        }
        if (status == false) {
            System.out.println("problems ahead");
        }
        sc.close();
    }
}