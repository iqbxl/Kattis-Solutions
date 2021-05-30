public class DeathKnight {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), won = 0;
        for (int i = 0; i < n; i++) {
            String sequence = io.getWord();
            if (!sequence.contains("CD")) {
                won++;
            }
        }
        io.print(won);
        io.flush();
    }
}