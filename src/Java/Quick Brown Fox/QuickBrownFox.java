public class QuickBrownFox {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String[] lowerCase = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        for (int i = 0; i < n; i++) {
            String phrase = io.getLine();
            String missing = "";
            for (int j = 0; j < 26; j++) {
                if (!(phrase.contains(lowerCase[j]) || phrase.contains(upperCase[j]))) {
                    missing += lowerCase[j];
                }
            }
            io.println(missing.length() == 0 ? "pangram" : "missing" + " " + missing);
        }
        io.flush();
    }
}