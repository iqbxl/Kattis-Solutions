public class AlphabetSpam {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        String string = io.getWord();
        int whitespace = 0, lowercase = 0, uppercase = 0, symbols = 0;
        double length = string.length();
        for (int i = 0; i < length; i++) {
            char x = string.charAt(i);
            if (x == '_') {
                whitespace++;
            } else if (x >= 97 && x <= 122) {
                lowercase++;
            } else if (x >= 65 && x <= 90) {
                uppercase++;
            } else {
                symbols++;
            }
        }
        io.println(whitespace / length);
        io.println(lowercase / length);
        io.println(uppercase / length);
        io.println(symbols / length);
        io.flush();
    }
}