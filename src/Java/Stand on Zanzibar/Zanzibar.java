public class Zanzibar {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in, System.out);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            int turtles, initial = io.getInt(), result = 0;
            while ((turtles = io.getInt()) != 0) {
                int diff = turtles - (initial << 1);
                if (diff > 0)
                    result += diff;
                    initial = turtles;
            }
            io.println(result);
        }
        io.flush();
    }
}