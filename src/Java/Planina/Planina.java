public class Planina {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int iterations = io.getInt();
        int side = 2;
        for (int  i = 0; i < iterations; i++) {
            side = side * 2 - 1;
        }
        io.println((int)Math.pow(side, 2));
        io.flush();
    }
}