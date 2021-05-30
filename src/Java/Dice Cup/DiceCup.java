public class DiceCup {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), b = io.getInt(), iterations;
        if (a == b || a > b) {
            iterations = a - b + 1;
        } else { 
            iterations = b - a + 1;
        }
        for (int i = 0; i < iterations; i++) {
            if (a == b || a > b) {
                b += 1;
                io.println(b);
            } else {
                a += 1;
                io.println(a);
            }
        }
        io.flush();
    }
}