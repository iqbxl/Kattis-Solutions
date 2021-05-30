public class Parking2 {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int test = io.getInt();
        for (int i = 0; i < test; i++) {
            int stores = io.getInt();
            Integer min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < stores; j++) {
                int position = io.getInt();
                if (position < min) {
                    min = position;
                }
                if (position > max) {
                    max = position;
                }
            }
            io.println((max - min) * 2);
        }
        io.flush();
    }
}