public class DigitProduct {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        while (input.length() != 1) {
            int x = 1;
            for (int i = 0; i < input.length(); i++) {
                if (!input.substring(i, i + 1).equals("0")) {
                    x *= Integer.parseInt(input.substring(i, i + 1));
                }
            }
            input = Integer.toString(x);
        }
        io.print(input);
        io.flush();
    }
}