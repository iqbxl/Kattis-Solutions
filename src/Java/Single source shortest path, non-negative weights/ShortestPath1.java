import java.io.*;
import java.util.*;

public class ShortestPath1 {
    private static int[] distance;
    private static ArrayList<Edge>[] nodes;
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);
        while (true) { //for (;;) { is also an infinite loop.
            String input = sc.readLine();
            if (input.equals("0 0 0 0")) {
                break;
            }
            String[] A = input.split(" ");
            int N, M, Q, S;
            N = Integer.parseInt(A[0]);
            M = Integer.parseInt(A[1]);
            Q = Integer.parseInt(A[2]);
            S = Integer.parseInt(A[3]);
            distance = new int[N];
            nodes = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new ArrayList<Edge>();
            }
            for (int i = 0; i < M; i++) { 
                A = sc.readLine().split(" ");
                int u, v, w;
                u = Integer.parseInt(A[0]);
                v = Integer.parseInt(A[1]);
                w = Integer.parseInt(A[2]);
                nodes[u].add(new Edge(v, w));
            }
            dijkstra(S);
            for (int i = 0; i < Q; i++) { 
                int a = Integer.parseInt(sc.readLine());
                dc.write(distance[a] == Integer.MAX_VALUE ? "Impossible\n" : distance[a] + "\n");
            }
        }
        dc.close();
        sc.close();
    }
    private static void dijkstra(int source) {
        PriorityQueue<Edge> q = new PriorityQueue<Edge>();
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        q.add(new Edge(source, 0));
        while (!q.isEmpty()) {
            Edge temp = q.poll();
            if (temp.weight > distance[temp.to])
                continue;
            for (Edge nxt: nodes[temp.to]) {
                int d = temp.weight + nxt.weight;
                if (d < distance[nxt.to])
                    q.add(new Edge(nxt.to, distance[nxt.to] = d));
            }
        }
    }
}

class Edge implements Comparable<Edge> {
        public int to;
        public int weight;
        public Edge(int a, int b) {
            to = a;
            weight = b;
        }
        public int compareTo(Edge a) {
            return weight - a.weight;
        }
}