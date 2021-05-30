public class SodaSlurper {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int ef = io.getInt() + io.getInt(), c = io.getInt(), sum = 0;
        while (ef >= c) {
            ef = ef - c;
            sum++;
            ef++;
        }
        io.print(sum);
        io.flush();
    }
}