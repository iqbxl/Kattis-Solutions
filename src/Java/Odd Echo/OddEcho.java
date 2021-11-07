import java.util.Scanner;

public class OddEcho {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String word = sc.next();
      if (i % 2 == 0) {
        System.out.println(word);
      }
    }
    sc.close();
  }
}