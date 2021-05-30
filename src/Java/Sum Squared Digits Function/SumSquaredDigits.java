public class SumSquaredDigits {
    public static int SSDF(int n, int b) {
        return (n == 0) ? 0
                : (n % b) * (n % b) + SSDF(n / b, b);
    }   
    
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
            int p = io.getInt();
            while (p-- > 0) {
                int k = io.getInt(), b = io.getInt(), n = io.getInt();
                io.println(k + " " + SSDF(n, b));
            }
            io.flush();
    }
}