public class QuadrantSelection {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt(), y = io.getInt();
        if (x > 0 && y > 0) {
            io.println(1);
        }
        else if (x < 0 && y > 0) {
            io.println(2);
        }
        else if (x < 0 && y < 0) {
            io.println(3);
        } 
        else if (x > 0 && y < 0) {
            io.println(4);
        }
        io.flush();
    }
}