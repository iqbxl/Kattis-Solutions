public class Pot {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), result = 0;
        for (int i = 0; i < n; i++) {
            int a = io.getInt();
            result += Math.pow(a / 10, a % 10);
        }
        io.println(result);
        io.flush();
    }
}