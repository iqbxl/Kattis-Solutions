public class Aaah {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String f = io.getWord(), s = io.getWord();
        if (f.length() >= s.length()) {
            io.print("go");
        } else {
            io.print("no");
        }
        io.flush();
    }
}