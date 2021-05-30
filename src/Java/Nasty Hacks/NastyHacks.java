public class NastyHacks {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int r = io.getInt(), eminusc = io.getInt() - io.getInt();
            if (r < eminusc) {
                io.println("advertise");
            } else if (r == eminusc) {
                io.println("does not matter");
            } else {
                io.println("do not advertise");
            }
            io.flush();
        }
    io.flush(); 
    }
}