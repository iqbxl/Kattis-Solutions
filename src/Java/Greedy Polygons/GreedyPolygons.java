public class GreedyPolygons {
    
    public static double cot(double x) {
        return 1 / Math.tan(x);
    }

    public static double angleExpansion(int d, int g) {
        return Math.pow((d * g), 2) * Math.PI;
    }

    public static double sideExpansion(int n, int l, int d, int g) {
        return (double) n * l * d * g;
    }

    public static double polygonArea(int n, int l) {
        // formula of regular polygon available in wiki
        return 0.25 * n * (l * l) * cot(Math.PI / n);
    }

    public static double expandedArea(int n, int l , int d, int g) {
        return polygonArea(n, l) + sideExpansion(n, l, d, g) + angleExpansion(d, g);
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int N = io.getInt();
        for (int i = 0; i < N; i++) {
            int n = io.getInt();
            int l = io.getInt();
            int d = io.getInt();
            int g = io.getInt();
            io.println(expandedArea(n, l, d, g));
        }
        io.flush();
    }
}