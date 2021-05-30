public class Volim {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int k = io.getInt(), n = io.getInt(), time = 0;
        for (int i = 0; i < n; i++) {
            int t = io.getInt();
            String z = io.getWord();
            time += t;
            if (time > 210) break;
            if (z.equals("T")) k++;
        }
        io.print(k % 8 == 0 ? 8 : k % 8); //rmb to check if remainder is 0.
        io.flush();                       //if yes, print 8.
    }
}