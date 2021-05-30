public class QALY {
    public static void main(String args[]) {
        Kattio sys = new Kattio(System.in);
        int n = sys.getInt(); double result = 0;
        for (int i = 0; i < n; i++) {
            result += sys.getDouble() * sys.getDouble();
        }
        sys.println(result);
        sys.flush();
    }
}