public class FYI {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String n = io.getWord();
        if (n.substring(0, 3).equals("555")) {
            io.print(1);
        } else {
            io.print(0);
        }
        io.flush();
    }
}