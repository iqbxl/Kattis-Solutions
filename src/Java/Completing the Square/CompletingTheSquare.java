public class CompletingTheSquare {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        
        int x1 = io.getInt();
        int y1 = io.getInt();
        int x2 = io.getInt();
        int y2 = io.getInt();
        int x3 = io.getInt();
        int y3 = io.getInt();
        
        double d1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double d2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        int[] arr = new int[4];
        Pair<Integer, Integer> pair = new Pair<>(); // initialize a null pair

        if (d1 > d2) {
            pair.first = x3;
            pair.second = y3;
            arr[0] = x1;
            arr[1] = y1;
            arr[2] = x2;
            arr[3] = y2;
        } else if (d2 > d1) {
            pair.first = x1;
            pair.second = y1;
            arr[0] = x2;
            arr[1] = y2;
            arr[2] = x3;
            arr[3] = y3;
        } else {
            pair.first = x2;
            pair.second = y2;
            arr[0] = x1;
            arr[1] = y1;
            arr[2] = x3;
            arr[3] = y3;
        }

        double xMid = (arr[0] + arr[2]) / 2.0; // find midpoint
        double yMid = (arr[1] + arr[3]) / 2.0;
        double dx = Math.abs(pair.first - xMid) * 2;
        double dy = Math.abs(pair.second - yMid) * 2;
        pair.first += (xMid >= pair.first) ? (int) dx : (int) -dx; // no brackets is also fine
        pair.second += (yMid >= pair.second) ? (int) dy : (int) -dy;
        io.print(pair.first + " " + pair.second);
        io.flush();
    }
}