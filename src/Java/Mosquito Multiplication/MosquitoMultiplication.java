public class MosquitoMultiplication {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (io.hasMoreTokens()) { 
            int m = io.getInt();
            int p = io.getInt();
            int l = io.getInt();
            int e = io.getInt();
            int r = io.getInt();
            int s = io.getInt();
            int n = io.getInt();
            for (int i = 0; i < n; i++) {
                int tempP = p;
                p = l / r;
                l = m * e;
                m = tempP / s;
            }
            io.println(m);
        }
        io.flush();
    }
}