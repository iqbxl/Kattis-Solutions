public class Oddities {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int x = io.getInt();
            if (x % 2 == 0) {
                io.println(x + " is even");
            } else {
                io.println(x + " is odd");
            }
        }
        io.flush();
    }
}