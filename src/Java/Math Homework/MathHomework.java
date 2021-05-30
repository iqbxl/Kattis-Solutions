public class MathHomework {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int b = io.getInt();
        int d = io.getInt();
        int c = io.getInt();
        int l = io.getInt();
        int count = 0;
        for (int i = 0; i <= l / b; i++) {
            for (int j = 0; j <= l / d; j++) {
                for (int k = 0; k <= l / c; k++) {
                    if (b * i + d * j + c * k == l) {
                        io.println(i + " " + j + " " + k);
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            io.print("impossible");
        }
        io.flush();
    }
}