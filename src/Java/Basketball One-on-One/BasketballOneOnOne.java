public class BasketballOneOnOne {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String x = io.getWord();
        int length = x.length(), sumA = 0, sumB = 0;
        for (int i = 0; i < length; i++) {
            if (x.charAt(i) == 'A') {
                sumA += (x.charAt(i + 1) - '0');
            } if (x.charAt(i) == 'B') {
                sumB += (x.charAt(i + 1) - '0');
            }
        }
        io.print(sumA > sumB ? "A" : "B");
        io.flush();
    }
}