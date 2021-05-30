public class Cold {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), result = 0;
        while (n-- > 0) {
            if (io.getInt() < 0) {
                result += 1;
            }
        }
        io.println(result);
        io.flush();
    }
}