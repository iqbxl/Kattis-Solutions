public class Spavanac {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int hours = io.getInt(), mins = io.getInt();
        mins -= 45;
        if (mins < 0) {
            hours -= 1;
            mins += 60;
        } if (hours < 0) {
            hours = 23;
        }
        io.println(hours + " " + mins);
        io.flush();
    }
}