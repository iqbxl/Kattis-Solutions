public class DiceGame {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int G = 0, E = 0;
        for (int i = 0; i < 4; i++) {
            G += io.getInt();
        }
        for (int i = 0; i < 4; i++) {
            E += io.getInt();
        }
        io.print(G == E ? "Tie" : G > E ? "Gunnar" : "Emma");
        io.flush();
    }
}