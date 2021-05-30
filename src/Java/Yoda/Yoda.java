public class Yoda {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String n = io.getWord();
        String m = io.getWord();
        int max = Math.max(n.length(), m.length());
        if (n.length() < m.length()) {
            n = String.format("%0" + max + "d", Integer.parseInt(n));
        }
        if (m.length() < n.length()) {
            m = String.format("%0" + max + "d", Integer.parseInt(m));
        }
        String nResult = "";
        String mResult = "";
        for (int i = 0; i < max; i++) {
            if (Integer.parseInt(n.substring(i, i + 1)) < Integer.parseInt(m.substring(i, i + 1))) {
                mResult += m.substring(i, i + 1);
            } else if (Integer.parseInt(m.substring(i, i + 1)) < Integer.parseInt(n.substring(i, i + 1))) {
                nResult += n.substring(i, i + 1);
            } else {
                nResult += n.substring(i, i + 1);
                mResult += m.substring(i, i + 1);
            }
        }
        if (nResult.length() == 0) {
            io.println("YODA");
        } else {
            io.println(Integer.parseInt(nResult));
        }
        if (mResult.length() == 0) {
            io.println("YODA");
        } else {
            io.println(Integer.parseInt(mResult));
        }
        io.flush();
    }
}