public class ApaxianParent {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String y = io.getWord(), p = io.getWord();
        int len = y.length();
        if (y.endsWith("e")) {
            io.print(y + "x" + p);
        } else if (y.endsWith("a") || y.endsWith("i") || y.endsWith("o") || y.endsWith("u")) {
            io.print(y.substring(0, len - 1) + "ex" + p);
        } else if (y.endsWith("ex")) {
            io.print(y + p);
        } else {
            io.print(y + "ex" + p);
        }
        io.flush();
    }
}