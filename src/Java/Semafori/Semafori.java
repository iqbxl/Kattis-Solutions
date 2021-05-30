public class Semafori {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int l = io.getInt();
        int time = 0;
        int distance = 0;
        for (int i = 0; i < n; i++) {
            int d = io.getInt();
            int r = io.getInt();
            int g = io.getInt();
            time += d - distance;
            distance = d;
            if (time % (r + g) < r) {
                time += r - (time % (r + g)); // check if traffic light is red at the position
            }
        }
        time += l - distance;
        io.println(time);
        io.flush();
    }
}