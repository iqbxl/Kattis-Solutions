public class DetailedDifferences {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String s1 = io.getWord();
            String s2 = io.getWord();
            io.println(s1);
            io.println(s2);
            String s = "";
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(j)) {
                    s += ".";
                } else {
                    s += "*";
                }
            }
            io.println(s);
            io.println("");
        }
        io.flush();
    }
}