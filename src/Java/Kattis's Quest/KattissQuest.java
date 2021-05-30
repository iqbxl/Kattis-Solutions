import java.util.*;
import java.io.*;

public class KattissQuest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        TreeMap<Integer, PriorityQueue<Integer>> treemap = new TreeMap<>(Collections.reverseOrder());
        int testcases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcases; i++) {
            String input = br.readLine();
            String[] A = input.split(" ");
            String comm = A[0];
            if (comm.equals("add")) {
                int energy = Integer.parseInt(A[1]);
                int gold = Integer.parseInt(A[2]);
                if (treemap.containsKey(energy)) {
                    treemap.get(energy).add(gold);
                } else {
                    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                    pq.add(gold);
                    treemap.put(energy, pq);
                }
            } else {
                long total = 0;
                int energy = Integer.parseInt(A[1]);
                while (energy != 0) {
                    Integer energyMax = 0;
                    if (treemap.containsKey(energy)) {
                        energyMax = energy;
                    } else {
                        energyMax = treemap.higherKey(energy);
                    }
                    if (energyMax == null) {
                        break;
                    }
                    int gold = treemap.get(energyMax).poll();
                    if (treemap.get(energyMax).size() == 0) {
                        treemap.remove(energyMax);
                    }
                    total = total + gold;
                    energy = energy - energyMax;
                }
                pw.println(total);
            }
        }
        pw.flush();
    }
}