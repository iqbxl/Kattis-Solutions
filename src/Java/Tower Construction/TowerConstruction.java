public class TowerConstruction {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int[] widths = new int[n];
        int towers = 1;
        for (int i = 0; i < n; i++) {
            widths[i] = io.getInt();
        }
        for (int i = 1; i < n; i++) {
            if (widths[i] <= widths[i - 1]) {
                continue;
            } else {
                towers++;
            }
        }
        io.print(towers);
        io.flush();
    }
}