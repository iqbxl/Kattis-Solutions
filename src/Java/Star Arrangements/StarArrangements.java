public class StarArrangements {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int s = io.getInt();
        io.println(s + ":");
        for (int i = 2; i < Math.round(s / 2.0) + 1; i++) { //Math.ceil or Math.round both can
            int y = i - 1;
            if (s % (i + y) == i || s % (i + y) == 0) {
                io.println(i + "," + y);
            } if (s % i == 0) {
                io.println(i + "," + i);
            }
        }
        io.flush();
    }
}