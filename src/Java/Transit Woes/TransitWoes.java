public class TransitWoes {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int s = io.getInt(), t = io.getInt(), n = io.getInt();
        int[] walkTime = new int[n + 1];
        int[] busRide = new int[n];
        int[] interval = new int[n];
        for (int i = 0; i < n + 1; i++) {
            walkTime[i] = io.getInt();
        }
        for (int i = 0; i < n; i++) {
            busRide[i] = io.getInt();
        }
        for (int i = 0; i < n; i++) {
            interval[i] = io.getInt();
        }
        int newTime = 0;
        for (int i = 0; i < n; i++) {
            newTime += walkTime[i];
            if (newTime <= interval[i] ) {
                newTime = busRide[i] + interval[i];
            } else {
                newTime = busRide[i] + ((int)Math.ceil((double)newTime / interval[i]) * interval[i]);
            }
        }
        int totalTimeTaken = newTime + walkTime[n];
        if (t - s >= totalTimeTaken) {
            io.print("yes");
        } else {
            io.print("no");
        }
        io.flush();
    }
}