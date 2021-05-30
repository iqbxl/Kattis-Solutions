public class TripleTexting {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        int lenWord = input.length() / 3;
        String output = "";
        String a = input.substring(0, lenWord);
        String b = input.substring(lenWord, lenWord * 2);
        String c = input.substring(lenWord * 2); // can omit the second arg
        if (a.equals(b) && b.equals(c)) {
            io.print(a);
        } else if (a.equals(b)) {
            io.print(a);
        } else if (b.equals(c)) {
            io.print(b);
        } else if (a.equals(c)) {
            io.print(c);
        }
        io.flush();
    }
}