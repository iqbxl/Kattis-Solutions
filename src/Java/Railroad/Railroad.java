public class Railroad {
    public static void main(String fff[]) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt(), y = io.getInt();
        if (y % 2 == 0) {
            io.print("possible");
        } else {
            io.print("impossible");
        }
        io.flush();
    }
}