import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class KnotKnowledge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> knots = new HashSet<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      knots.add(sc.nextInt());
    }
    for (int i = 0; i < n - 1; i++) {
      int learnt = sc.nextInt();
      if (knots.contains(learnt)) {
        knots.remove(learnt);
      }
    }
    for (int knot : knots) {
      System.out.println(knot);
    }
    sc.close();
  }
}