public class QuickEstimates {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (n-- > 0) {
            String res = io.getWord();
            io.println(res.length());
        }
        io.flush();
    }
}