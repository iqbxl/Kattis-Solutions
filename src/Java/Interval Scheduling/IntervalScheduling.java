import java.util.Scanner;
import java.util.Arrays;

public class IntervalScheduling {
  
  public static class Pair implements Comparable<Pair> {
    
    int start, finish;
    
    Pair(int s, int f) {
      start = s;
      finish = f;
    }

    @Override
    public int compareTo(Pair p) {
      if (this.finish > p.finish) {
        return 1;
      } else if (this.finish < p.finish) {
        return -1;
      } else {
        return 0;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pair[] intervals = new Pair[n];
    for (int i = 0; i < n; i++) {
      intervals[i] = new Pair(sc.nextInt(), sc.nextInt());
    }
    Arrays.sort(intervals); // OR Collections.sort(Arrays.asList(intervals));
    
    int res = 1;
    int f0 = intervals[0].finish;
    for (int i = 1; i < n; i++) {
      int s1 = intervals[i].start;
      int f1 = intervals[i].finish;
      if (s1 >= f0) {
        res++;
        f0 = f1;
      }
    }
    System.out.println(res);
    sc.close();
  }
}