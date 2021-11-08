import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(0.5 * h * b);
    sc.close();
  }
}