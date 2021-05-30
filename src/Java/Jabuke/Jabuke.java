import java.util.Scanner;

public class Jabuke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];
        for (int i = 0; i < 3; i++) {
            xPoints[i] = sc.nextInt();
            yPoints[i] = sc.nextInt();
        }
        double area = Math.abs(xPoints[0] * (yPoints[1] - yPoints[2]) + xPoints[1] * (yPoints[2] - yPoints[0]) + xPoints[2] * (yPoints[0] - yPoints[1])) / 2.0;
        System.out.println(area);
        int n = sc.nextInt();
        int trees = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double a1 = Math.abs(x * (yPoints[1] - yPoints[2]) + xPoints[1] * (yPoints[2] - y) + xPoints[2] * (y - yPoints[1])) / 2.0;
            double a2 = Math.abs(xPoints[0] * (y - yPoints[2]) + x * (yPoints[2] - yPoints[0]) + xPoints[2] * (yPoints[0] - y)) / 2.0;
            double a3 = Math.abs(xPoints[0] * (yPoints[1] - y) + xPoints[1] * (y - yPoints[0]) + x * (yPoints[0] - yPoints[1])) / 2.0;
            if (a1 + a2 + a3 <= area) {
                trees++;
            }
        }
        System.out.println(trees);
        sc.close();
    }
}