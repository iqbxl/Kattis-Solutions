public class PrintedStatues {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int days = 0;
        int printers = 1;
        while (printers < n) {
            printers *= 2;
            days++;
        }
        io.print(days + 1);
        io.flush();
    }
}