import java.util.*;

public class Arbitrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curr = Integer.parseInt(sc.nextLine());
        while (curr > 0) {
            String[] cod = sc.nextLine().split(" ");
            int currPairs = Integer.parseInt(sc.nextLine());
            String[][] A = new String[currPairs][2];
            double[] weights = new double[currPairs];
            for (int i = 0; i < currPairs; i++) {
                String[] p = sc.nextLine().split(" ");
                A[i][0] = p[0];
                A[i][1] = p[1];
                String[] temp = p[2].split(":");
                weights[i] = Weightval(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
            if (isBF(cod, A, weights, currPairs)) {
                System.out.println("Ok");
            } else {
                System.out.println("Arbitrage");
            }
            curr = Integer.parseInt(sc.nextLine());
        }
    }
    public static double Weightval(int a, int b) { //calc weight
        return - (Math.log((double) b / a));
    }
    public static boolean isBF(String[] vtx, String[][] edges, double[] weights, int numE) {
        HashMap<String, Double> dist = new HashMap<>();
        for (int k = 0; k < vtx.length; k++) {
            for (int i = 0; i < vtx.length; i++) {
                double inf = Double.POSITIVE_INFINITY;
                dist.put(vtx[i], inf);
            }
            dist.put(vtx[k], (double) 0); //put the string and double value into the HashMap
            for (int i = 0; i < vtx.length - 1; i++) {
                for (int j = 0; j < numE; j++) {
                    if (weights[j] + dist.get(edges[j][0]) < dist.get(edges[j][1])) {
                        dist.put(edges[j][1], weights[j] + dist.get(edges[j][0]));
                    }
                }
            }
            for (int j = 0; j < numE; j++) {
                if (dist.get(edges[j][0]) + weights[j] < dist.get(edges[j][1])) {
                    return false;
                }
            }
        }
        return true;
    }
}