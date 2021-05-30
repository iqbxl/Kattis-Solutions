public class TaisFormula {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), init1 = io.getInt(); 
        double init2 = io.getDouble(), result = 0;
        for (int i = 1; i < n; i++) {
            int t = io.getInt();
            double v = io.getDouble();
            init1 = t - init1; 
            init2 = v + init2;
            result = result + (init1 * init2) / 2;
            init1 = t;
            init2 = v;
        }
        io.println(result / 1000);
        io.flush();
    }
}