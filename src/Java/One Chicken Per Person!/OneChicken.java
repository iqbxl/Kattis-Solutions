public class OneChicken {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), m = io.getInt();
        if (m > n + 1) {
            io.print("Dr. Chaz will have " + (m - n) + " pieces of chicken left over!");
        } else if (m == n + 1) {
            io.print("Dr. Chaz will have 1 piece of chicken left over!");
        } else if (n > m + 1) {
            io.print("Dr. Chaz needs " + (n - m) + " more pieces of chicken!");
        } else if (n == m + 1) {
            io.print("Dr. Chaz needs 1 more piece of chicken!");
        }
        io.flush();
    }
}