import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;

public class MinimumSpanningTree {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (io.hasMoreTokens()) {
            long total = 0;
            List<Edge> minnoedge = new ArrayList<>();
            int n = io.getInt();
            if (n == 0) { 
                break;
            }
            int m = io.getInt(); 
            Node[] nodes = new Node[n];
            
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node(i);
            }
            
            for (int i = 0; i < m; i++) {
                int u = io.getInt();
                int v = io.getInt();
                int w = io.getInt();
                if (u != v) {
                    Edge edgeU = new Edge(nodes[v], w);
                    Edge edgeV = new Edge(nodes[u], w);
                    nodes[u].adjList.add(edgeU);
                    nodes[v].adjList.add(edgeV);  
                }
            }
            p_rim(nodes);
            for (Node node: nodes) {
                if (node.prev != null) {
                    total += node.distance;
                    if (node.prev.number > node.number) {
                        minnoedge.add(new Edge(node, node.prev, node.distance));
                    } else {
                        minnoedge.add(new Edge(node.prev, node, node.distance));
                    }
                }
            }
            if (minnoedge.isEmpty() || minnoedge.size() != n - 1) {
                io.println("Impossible");
            } else {
                Collections.sort(minnoedge, new Comparator<Edge>() {
                    @Override
                    public int compare(Edge first, Edge second) {
                        if (first.start.number != second.start.number) {
                            return Integer.compare(first.start.number, second.start.number);
                        } else {
                            return Integer.compare(first.end.number, second.end.number);
                        }
                    }});
                io.println(total);
                for (Edge edge : minnoedge) {
                    io.println(edge.start.number + " " + edge.end.number);
                }
            }
        }
        io.flush();
    }

    public static void p_rim(Node[] nodes) {
        PriorityQueue<Node> qNodes = new PriorityQueue<>();
        for (Node node: nodes) {
            qNodes.add(node);
        }
        Node peek = qNodes.peek();
        peek.distance = 0;
        while (!qNodes.isEmpty()) {
            Node needsChecking = qNodes.poll();
            for (Edge edge : needsChecking.adjList) {
                Node src = edge.start;
                if (!src.visited && edge.weight < src.distance) {
                    qNodes.remove(src);
                    src.distance = edge.weight;
                    needsChecking.visited = true;
                    src.prev = needsChecking;
                    qNodes.add(src);
                }
            }
        }
    }
}