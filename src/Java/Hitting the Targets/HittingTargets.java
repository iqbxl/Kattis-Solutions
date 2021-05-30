import java.util.ArrayList;

public class HittingTargets {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int m = io.getInt();
        ArrayList<Integer> rec = new ArrayList<>();
        ArrayList<Integer> cir = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (io.getWord().equals("rectangle")) {
                for (int j = 0; j < 4; j++) {
                    rec.add(io.getInt()); // ArrayList maintains insertion order of elements
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    cir.add(io.getInt());
                }
            }
        }
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int x = io.getInt(), y = io.getInt(), shots = 0;
            for (int j = 0; j < rec.size(); j += 4) {
                if (x >= rec.get(j) && x <= rec.get(j + 2) && y >= rec.get(j + 1) && y <= rec.get(j + 3)) {
                    shots++;
                }
            }
            for (int j = 0; j < cir.size(); j += 3) {
                if (Math.sqrt(Math.pow(x - cir.get(j), 2) + Math.pow(y - cir.get(j + 1), 2)) <= cir.get(j + 2)) {
                    shots++;
                }
            }
            io.println(shots);
        }
        io.flush();
    }
}