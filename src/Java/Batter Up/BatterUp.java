public class BatterUp {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int atbats = io.getInt(), sum = 0, count = 0;
        for (int i = 0; i < atbats; i++) {
            int x = io.getInt();
            if (x != -1) {
                sum += x;
                count += 1;
            }
        }
        io.println((double) sum / count);
        io.flush();
    }
}