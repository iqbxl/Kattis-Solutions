public class MoscowDream {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), b = io.getInt(), c = io.getInt(), n = io.getInt();
        if (a > 0 && b > 0 && c > 0 && n > 2 && a + b + c >= n) {
            io.print("YES");
        } else {
            io.print("NO");
        }
        io.flush();
    }
}