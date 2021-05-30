public class ElectricalOutlets {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int testCases = io.getInt();
        for (int i = 0; i < testCases; i++) {
            int powerStrips = io.getInt();
            int res = 0;
            for (int j = 0; j < powerStrips; j++) {
                res += io.getInt();
            }
            io.println(res - powerStrips + 1);
        }
        io.flush();
    }
}