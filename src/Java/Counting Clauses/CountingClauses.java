public class CountingClauses {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int m = io.getInt();
        if (m < 8) {
            io.print("unsatisfactory");
        } else {
            io.print("satisfactory");
        }
        io.flush();
    }
}