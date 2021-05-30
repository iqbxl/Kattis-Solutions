public class HeartRate {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int cases = io.getInt();
        for (int i = 0; i < cases; i++) {
            double beats = io.getInt(), time = io.getDouble();
            double bpm = 60 * beats / time;
            double minabpm = bpm - 60 / time, maxabpm = bpm + 60 / time;
            io.println(minabpm + " " + bpm + " " + maxabpm);
        }
        io.flush();
    }
}