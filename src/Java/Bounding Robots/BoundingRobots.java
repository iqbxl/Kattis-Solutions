public class BoundingRobots {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int w = io.getInt(), l = io.getInt();
            if (w == 0 && l == 0) break;
            int n = io.getInt();
            int wThinks = 0, lThinks = 0, wActually = 0, lActually = 0;
            for (int i = 0; i < n; i++) {
                String x = io.getWord();
                int y = io.getInt();
                if (x.equals("u")) {
                        lThinks += y;
                        lActually += y;
                        if (lActually > l - 1) lActually = l - 1;
                } else if (x.equals("d")) {
                        lThinks -= y;
                        lActually -= y;
                        if (lActually < 0) lActually = 0;
                } else if (x.equals("l")) {
                        wThinks -= y;
                        wActually -= y;
                        if (wActually < 0) wActually = 0;
                } else {
                        wThinks += y;
                        wActually += y;
                        if (wActually > w - 1) wActually = w - 1;
                }
            }
            io.println("Robot thinks " + wThinks + " " + lThinks);
            io.println("Actually at " + wActually + " " + lActually);
            io.println();
        }
        io.flush();
    }
}