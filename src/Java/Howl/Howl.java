public class Howl {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        io.print(input + "O");
        io.flush();
    }
}