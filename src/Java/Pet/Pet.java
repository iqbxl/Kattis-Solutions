public class Pet {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int max = 0, idx = 0;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += io.getInt();
            }
            if (sum > max) {
                max = sum;
                idx = i;
            }
        }
        io.println((idx + 1) + " " + max);
        io.flush();
    }
}