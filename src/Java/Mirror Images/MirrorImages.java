public class MirrorImages {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            io.println("Test " + (i + 1));
            int r = io.getInt();
            int c = io.getInt();
            String[] line = new String[r];
            for (int j = r - 1; j >= 0; j--) {
                String row = io.getLine();
                line[j] = new StringBuilder(row).reverse().toString(); // use StringBuilder() to reverse a string
            }
            for (String s : line) {
                io.println(s);
            }
        }
        io.flush();
    }
}