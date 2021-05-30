public class MarsWindow {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int y = io.getInt();
        int diff = (y - 2018) * 12 + 8;
        boolean isWindow = false;
        for (int i = 0; i < 11; i++) {
            if (diff % 26 == 0) {
                io.println("yes");
                isWindow = true;
                break;
            } else {
                diff--;
            }
        }
        if (isWindow == false) {
            io.print("no");
        }
        io.flush();
    }
}