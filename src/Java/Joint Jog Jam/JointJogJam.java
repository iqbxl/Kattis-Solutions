import java.util.Scanner;

public class JointJogJam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] distance = new double[2];
    for (int i = 0; i < 2; i++) {
      int k1 = sc.nextInt();
      int k2 = sc.nextInt();
      int o1 = sc.nextInt();
      int o2 = sc.nextInt();
      distance[i] = Math.sqrt(Math.pow(k1 - o1, 2) + Math.pow(k2 - o2, 2));
    }
    System.out.println(distance[0] > distance[1] ? distance[0] : distance[1]);
    sc.close();
  }
}