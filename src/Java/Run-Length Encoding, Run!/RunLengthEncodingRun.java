public class RunLengthEncodingRun {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String letter = io.getWord();
        String text = io.getWord();
        String ans = "";
        if (letter.equals("E")) {
            int count = 0;
            String temp = text.substring(0, 1); // current letter in text we're looking at
            for (int i = 0; i < text.length(); i++) {
                if (text.substring(i, i + 1).equals(temp)) {
                    count++;
                } else { // next letter is a different letter
                    ans += temp + count;
                    temp = text.substring(i, i + 1);
                    count = 1;
                }
            }
            io.print(ans + temp + count);
        } else {
            for (int i = 0; i < text.length(); i += 2) {
                int count = Integer.parseInt(text.substring(i + 1, i + 2));
                for (int j = 0; j < count; j++) {
                    ans += text.substring(i, i + 1);
                }
            }
            io.print(ans);
        }
        io.flush();
    }
}