public class TheLastProblem {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String s = io.getLine();
        io.print("Thank you, " + s + ", and farewell!");
        io.flush();
    }
}