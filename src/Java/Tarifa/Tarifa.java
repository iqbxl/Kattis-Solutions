public class Tarifa {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in, System.out);
        int x = io.getInt();
        int n = io.getInt();
        int p = x;
        for (int i = 0; i < n; i++) {
            p = p - io.getInt() + x; //logic of code
        }
        io.println(p);
        io.flush();
    }
}