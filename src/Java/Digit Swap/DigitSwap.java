import java.util.Scanner;

public class DigitSwap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String code = sc.next();
    String reversed = "";
    for (int i = 0; i < 2; i++) {
      reversed = code.substring(i, i + 1) + reversed;
    }
    System.out.println(reversed);
    sc.close();
  }
}