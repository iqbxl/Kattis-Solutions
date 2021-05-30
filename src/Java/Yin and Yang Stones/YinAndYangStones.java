public class YinAndYangStones {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String s = io.getWord();
        int countW = 0, countB = 0;
        for  (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                countW++;
            } else {
                countB++;
            }
        }
        io.print(countW == countB ? 1 : 0);
        io.flush();
    }
}