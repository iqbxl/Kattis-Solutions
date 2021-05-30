public class R2 {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), b = io.getInt();
        int c = b * 2 - a;
        io.println(c);
        io.flush();
    }
}