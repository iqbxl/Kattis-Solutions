public class ADifferentProblem {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (io.hasMoreTokens()) {
            io.println(Math.abs(io.getLong() - io.getLong()));
        }
        io.flush();
    }
}