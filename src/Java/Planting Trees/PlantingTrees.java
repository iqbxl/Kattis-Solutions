import java.util.PriorityQueue;
import java.util.Collections;

public class PlantingTrees {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // to get the maximum element
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            pq.offer(io.getInt());
        }
        int day = 2; // since it takes 1 day to plant a seedling and 1 more extra day after the last tree has grown up
        int result = 0;
        while (pq.size() != 0) {
            result = Math.max(pq.peek() + day, result);
            pq.poll();
            day++;
        }
        io.print(result);
        io.flush();
    }
}