public class HydrasHeads {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int h = io.getInt(), t = io.getInt(), s = 0;
            if (h == 0 && t == 0) break;
            while (true) {
                if (h == 0 && t == 0) break;
                if (h % 2 != 0 && t - 2 >= 0) {
                    t -= 2;
                    h++;
                    s++;
                } else if (h - 2 >= 0) {
                    h -= 2;
                    s++;
                } if ((h == 0 || h == 1) && t % 2 != 0 || (h == 0 || h == 1) && t == 2) {
                    t++;
                    s++;
                } else if (h == 0 && t >= 4 && t % 2 == 0) {
                    t -= 2;
                    h++;
                    s++;
                }
            }
            io.println(s);
        }
        io.flush();
    }
}