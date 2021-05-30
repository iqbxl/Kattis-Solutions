import java.util.List;
import java.util.ArrayList;

public class SchoolSpirit {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.add(io.getInt());
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scores.get(i) * Math.pow(0.8, i);
        }
        io.println(sum / 5);

        double avg = 0;
        for (int i = 0; i < n; i++) {
            double current = 0;
            int used = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    current += scores.get(j) * Math.pow(0.8, used);
                    used++;
                }
            }
            current /= 5;
            avg += current;
        }
        io.print(avg / n);
        io.flush();
    }
}