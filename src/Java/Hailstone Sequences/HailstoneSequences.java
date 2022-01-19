import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class HailstoneSequences {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Long> seq = new ArrayList<>();
    long n = sc.nextLong();
    seq.add(n);
    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;
        seq.add(n);
      } else {
        n = 3 * n + 1;
        seq.add(n);
      }
    }
    System.out.println(seq.size());
    sc.close();
  }
}