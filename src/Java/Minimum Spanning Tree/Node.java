import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {
    public int number;
    public int distance = Integer.MAX_VALUE;
    public boolean visited;
    public Node prev;
    public List<Edge> adjList;
    
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
    public Node(int number) {
        this.adjList = new ArrayList<>();
        this.number = number;
        this.visited = false;
    }
}