public class BreakingBranches {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        if (n % 2 == 0) {
            io.println("Alice");
            io.print(1);
        } else {
            io.print("Bob");
        }
        io.flush();
    }
}