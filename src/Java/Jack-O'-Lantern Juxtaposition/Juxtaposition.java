public class Juxtaposition {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        io.print(io.getInt() * io.getInt() * io.getInt());
        io.flush();
    }
}