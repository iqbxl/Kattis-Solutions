import java.io.*;
import java.util.*;

public class ButtonBashing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int testcases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcases; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int targ = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            ArrayList<Integer> nList = new ArrayList<>();
            for (int t = 0; t < n; t++) {
                int num = Integer.parseInt(input[t]);
                nList.add(num);
            }
            HashMap<Integer, Time> g = new HashMap<>();
            for (int t = 0; t < 3601; t++) {
                Time time = new Time(t);
                g.put(t, time);
            }
            ArrayList<Pair> q = new ArrayList<>();
            Pair pair = new Pair(g.get(0), 0);
            g.get(0).press = 0;
            q.add(pair);
            while (q.size() != 0) {
                pair = q.get(0);
                q.remove(0);
                Time parent = pair.time;
                int timeNow = pair.timeNow;
                int press = parent.press;
                for (int t = 0; t < nList.size(); t++) {
                    int child = nList.get(t);
                    int temp = Math.max(0, child + timeNow);
                    temp = Math.min(temp, 3600);
                    if (press + 1 < g.get(temp).press) {
                        g.get(temp).press = 1 + press;
                        pair = new Pair(g.get(temp), temp);
                        q.add(pair);
                    }
                }
            }
            if (g.get(targ).press != Integer.MAX_VALUE) {
                pw.println(g.get(targ).press + " " + 0);
            } else {
                for (int t = targ; t < 3601; t++) {
                    if (g.get(t).press != Integer.MAX_VALUE) {
                        pw.println(g.get(t).press + " " + (t - targ));
                        break;
                    }
                }
            }
        }
        pw.flush();
    }
}

class Time {
    public int value, press;
    Time(int value) {
        this.value = value;
        this.press = Integer.MAX_VALUE;
    }
    public String toString() {
        return value + " ";
    }
}
class Pair {
    public int timeNow;
    public Time time;
    Pair(Time time, int timeNow) {
        this.timeNow = timeNow;
        this.time = time;
    }
    public String toString() {
        return time + " " + timeNow;
    }
}