public class TrainPassengers {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int c = io.getInt();
        int n = io.getInt();
        int current = 0; // at the start, current no. is 0
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            int left = io.getInt();
            int entered = io.getInt();
            int stay = io.getInt();
            if (left > current) { // not possible to have more people that left the train that the current no.
                possible = false;
            }
            current += entered - left;
            if (current > c || current < 0 || current != c && stay > 0) {
                possible = false;
            }
        }
        if (current != 0) { // at the end, check if current no. is 0
            possible = false;
        }
        io.print(possible ? "possible" : "impossible");
        io.flush();
    }
}