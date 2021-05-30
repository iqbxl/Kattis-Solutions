public class GrassSeed {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        double cost = io.getDouble();
        int lawns = io.getInt();
        double lawnArea = 0;
        for (int i = 0; i < lawns; i++) {
            lawnArea += io.getDouble() * io.getDouble();
        }
        io.println(cost * lawnArea);
        io.flush();
    }
}