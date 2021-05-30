public class HangingOut {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int limit = io.getInt(), events = io.getInt(), temp = 0, count = 0;
        for (int i = 0; i < events; i++) {
            String x = io.getWord();
            int p = io.getInt();
            if (x.equals("enter")) {
                temp += p;
            } if (x.equals("leave")) {
                temp -= p;
            } if (temp > limit) {
                count += 1;
                temp -= p;
            }
        }
        io.println(count);
        io.flush();
    }
}