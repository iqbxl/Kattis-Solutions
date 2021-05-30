public class Tetration {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        double n = io.getDouble();
        io.print(Math.pow(n, 1 / n)); //formula for infinite towers tetration
        io.flush();
    }
}