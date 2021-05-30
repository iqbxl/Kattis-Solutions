public class LeftBeehind {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int x = io.getInt(), y = io.getInt();
            if (x == 0 && y == 0) break;
            if (x + y == 13) {
                io.println("Never speak again.");
            }
            else if (x > y) {
                io.println("To the convention.");
            }
            else if (x < y) {
                io.println("Left beehind.");
            }
            else if (x == y) {
                io.println("Undecided.");
            }
        }
        io.flush();
    }
}