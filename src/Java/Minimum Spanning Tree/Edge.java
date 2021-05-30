public class Edge {
    public Node start;
    public Node end;
    public int weight;
    
    public Edge(Node start, Node end, int weight) {
        this.weight = weight;
        this.start = start;
        this.end = end;
    }
    public Node getStart() {
        return this.start;
    }
    public Node getEnd() {
        return this.end;
    }
    public Edge(Node start, int weight) {
        this.weight = weight;
        this.start = start;
    }
}