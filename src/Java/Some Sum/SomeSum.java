public class SomeSum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int N = io.getInt();
        if (!(N % 2 == 0)) {
            io.print("Either");
        }
        if (N == 2 || N == 6 || N == 10) {
            io.print("Odd");
        }
        if (N == 4 || N == 8) {
            io.print("Even");
        }
        io.flush();
    }
}