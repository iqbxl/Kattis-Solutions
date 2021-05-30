public class Friday {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            int d = io.getInt();
            int m = io.getInt();
            int sumOfDays = 0;
            int ans = 0;
            for (int j = 0; j < m; j++) {
                int daysInMonth = io.getInt();
                if (daysInMonth > 12 && (sumOfDays + 13) % 7 == 6) {
                    ans++;
                }
                sumOfDays += daysInMonth;
            }
            io.println(ans);
        }
        io.flush();
    }
}