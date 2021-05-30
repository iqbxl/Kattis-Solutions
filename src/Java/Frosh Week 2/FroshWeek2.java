import java.util.Arrays;

public class FroshWeek2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), m = io.getInt();
        int[] tasks = new int[n];
        int[] intervals = new int[m];
        for (int i = 0; i < n; i++) {
            tasks[i] = io.getInt();
        }
        for (int i = 0; i < m; i++) {
            intervals[i] = io.getInt();
        }
        Arrays.sort(tasks);
        Arrays.sort(intervals);
        int check = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = check; j < m; j++) {
                if (tasks[i] <= intervals[j]) {
                    res++;
                    check = j + 1;
                    break;
                }
            }
        }
        io.print(res);
        io.flush();
    }
}