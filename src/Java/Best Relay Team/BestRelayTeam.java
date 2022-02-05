import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Runner implements Comparable<Runner> {

  public String name;
  public double firstLeg;
  public double otherLeg;

  public Runner(String n, double f, double o) {
    this.name = n;
    this.firstLeg = f;
    this.otherLeg = o;
  }

  public int compareTo(Runner otherRunner) {
    if (this.otherLeg < otherRunner.otherLeg) {
      return -1;
    } else if (this.otherLeg > otherRunner.otherLeg) {
      return 1;
    } else {
      return 0;
    }
  }
}

public class BestRelayTeam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Runner[] runners = new Runner[n];
    for (int i = 0; i < n; i++) {
      String name = sc.next();
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      runners[i] = new Runner(name, a, b);
    }

    Arrays.sort(runners);
    double res = Integer.MAX_VALUE;
    List<Integer> team = null;

    for (int i = 0; i < n; i++) {
      double tempRunner = runners[i].firstLeg;
      List<Integer> currentTeam = new ArrayList<>();
      currentTeam.add(i);

      for (int j = 0; currentTeam.size() < 4; j++) {
        if (i == j) continue;
        currentTeam.add(j);
        tempRunner += runners[j].otherLeg;
      }

      if (tempRunner < res) {
        res = tempRunner;
        team = currentTeam;
      }
    }
    System.out.println(res);
    for (int i = 0; i < 4; i++) {
      System.out.println(runners[team.get(i)].name);
    }
    sc.close();
  }
}
