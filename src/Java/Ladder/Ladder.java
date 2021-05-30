public class Ladder {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt();
        double sinOfAngle = Math.sin(Math.toRadians(io.getInt()));
        io.println((int) Math.ceil(a / sinOfAngle));
        io.flush();
    }
}