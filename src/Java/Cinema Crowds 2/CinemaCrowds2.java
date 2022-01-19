import java.util.Scanner;

public class CinemaCrowds2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int sum = 0;
    int accepted = 0;
    int[] group = new int[m];
    for (int i = 0; i < m; i++) {
      group[i] = sc.nextInt();
    }
    while (sum <= n) {
      sum += group[accepted];
      accepted++;
    }
    System.out.println(m - accepted + 1);
    sc.close();
  }
}