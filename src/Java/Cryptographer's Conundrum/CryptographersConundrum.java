public class CryptographersConundrum {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        String text = io.getWord();
        int len = text.length();
        String name = "";
        for (int i = 0; i < len / 3; i++) {
            name += "PER";
        }
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != name.charAt(i)) {
                result += 1;
            }
        }
        io.println(result);
        io.flush();
    }
}