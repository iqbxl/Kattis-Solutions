public class LicenseToLaunch {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), idx = 0;
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = io.getInt();
            if (x < min) {
                min = x;
                idx = i;
            }
        }
        io.print(idx);
        io.flush();
    }
}