import java.util.*;
import java.io.*;

public class DrivingRange {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int V = Integer.parseInt(line[0]);
        int E = Integer.parseInt(line[1]);
        Graph g = new Graph(V, E);
        for (int i = 0; i < E; i++) {
            line = br.readLine().split(" ");
            g.edge[i].s_rc = Integer.parseInt(line[0]);
            g.edge[i].destination = Integer.parseInt(line[1]);
            g.edge[i].weight = Integer.parseInt(line[2]);
        }
        if (E < V) {
            System.out.println("IMPOSSIBLE");
        } else {
            g.Kruskal();
        }
    }
    static class Graph { //create new class graph with methods inside
        class Edge implements Comparable<Edge> {
            int weight, s_rc, destination;
            public int compareTo(Edge compareEdge) {
                return (weight - compareEdge.weight);
            }
        };
        class subset {
            int parent;
            int rank;
        };
        int V, E;
        Edge edge[];
        Graph(int v, int e) {
            V = v;
            E = e;
            edge = new Edge[E];
            for (int i = 0; i < e; i++) {
                edge[i] = new Edge();
            }
        }
        int find(subset ss[], int i) {
            if (i != ss[i].parent) {
                ss[i].parent = find(ss, ss[i].parent);
            }
            return ss[i].parent;
        }
        void Union(subset ss[], int x, int y) {
            int rootX = find(ss, x);
            int rootY = find(ss, y);
            if (ss[rootX].rank < ss[rootY].rank) {
                ss[rootX].parent = rootY;
            } else if (ss[rootX].rank > ss[rootY].rank) {
                ss[rootY].parent = rootX;
            } else {
                ss[rootY].parent = rootX;
                ss[rootX].rank++;
            }
        }
        void Kruskal() {
            Edge result[] = new Edge[V];
            for (int i = 0; i < V; i++) {
                result[i] = new Edge();
            }
            Arrays.sort(edge);
            subset ss[] = new subset[V];
            for (int i = 0; i < V; i++) {
                ss[i] = new subset();
            }
            for (int j = 0; j < V; j++) {
                ss[j].parent = j;
                ss[j].rank = 0;
            }
            int i = 0;
            int e = 0;
            while (e < V - 1) {
                Edge edgeNeigh = new Edge();
                edgeNeigh = edge[i++];
                int x = find(ss, edgeNeigh.s_rc);
                int y = find(ss, edgeNeigh.destination);
                if (x != y) {
                    result[e++] = edgeNeigh;
                    Union(ss, x, y);
                }
            }
            int highest = 0;
            for (i = 0; i < e; i++) {
                if (result[i].weight > highest) {
                    highest = result[i].weight;
                }
            }
            System.out.println(highest == 0 ? "IMPOSSIBLE" : highest);
        }
    }
}