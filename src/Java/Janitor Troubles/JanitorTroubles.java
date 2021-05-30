public class JanitorTroubles {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int s1 = io.getInt(), s2 = io.getInt(), s3 = io.getInt(), s4 = io.getInt();
        double semiperimeter = (s1 + s2 + s3 + s4) / 2.0;
        io.print(Math.sqrt((semiperimeter - s1) * (semiperimeter - s2)
                * (semiperimeter - s3) * (semiperimeter - s4)));
        io.flush();
    }
}