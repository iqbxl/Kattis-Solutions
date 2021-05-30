public class BrokenSwords {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int swords = 0;
        int tbNotBroken = 0;
        int lrNotBroken = 0;
        for (int i = 0; i < n; i++) {
            String input = io.getLine();
            if (input.substring(0, 1).equals("0")) {
                tbNotBroken++;
            }
            if (input.substring(1, 2).equals("0")) {
                tbNotBroken++;
            }
            if (input.substring(2, 3).equals("0")) {
                lrNotBroken++;
            }
            if (input.substring(3, 4).equals("0")) {
                lrNotBroken++;
            }
        }
        while (tbNotBroken >= 2 && lrNotBroken >= 2) {
            swords++;
            tbNotBroken -= 2;
            lrNotBroken -= 2;
        }
        io.print(swords + " " + tbNotBroken + " " + lrNotBroken);
        io.flush();
    }
}