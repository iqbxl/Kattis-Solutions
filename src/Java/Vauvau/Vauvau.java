public class Vauvau {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt();
        int b = io.getInt();
        int c = io.getInt();
        int d = io.getInt();
        int p = io.getInt();
        int m = io.getInt();
        int g = io.getInt();
        int pCopy = p;
        int mCopy = m;
        int gCopy = g;
        
        while (p > a + b) {
            p -= (a + b);
        }
        while (pCopy > c + d) {
            pCopy -= (c + d);
        }
        if (p <= a && pCopy <= c) {
            io.println("both");
        } else if (p > a && pCopy > c) {
            io.println("none");
        } else {
            io.println("one");
        }

        while (m > a + b) {
            m -= (a + b);
        }
        while (mCopy > c + d) {
            mCopy -= (c + d);
        }
        if (m <= a && mCopy <= c) {
            io.println("both");
        } else if (m > a && mCopy > c) {
            io.println("none");
        } else {
            io.println("one");
        }

        while (g > a + b) {
            g -= (a + b);
        }
        while (gCopy > c + d) {
            gCopy -= (c + d);
        }
        if (g <= a && gCopy <= c) {
            io.println("both");
        } else if (g > a && gCopy > c) {
            io.println("none");
        } else {
            io.println("one");
        }
        io.flush();
    }
}