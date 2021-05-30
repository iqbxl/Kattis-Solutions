public class GoatRope {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt(), y = io.getInt();
        int x1 = io.getInt(), y1 = io.getInt();
        int x2 = io.getInt(), y2 = io.getInt();
        if (x >= x1 && x <= x2) { //Case 1: goat is within the y-axis of the house
            if (y < y1) {
                io.println(y1 - y);
            } else {
                io.println(y - y2);
            }
        }
        else if (y >= y1 && y <= y2) { //Case 2: goat is within the x-axis of the house
            if (x < x1) {
                io.println(x1 - x);
            } else {
                io.println(x - x2);
            }
        }
        else if (x > x2) { //Case 3: goat is diagonally right of the house
            if (y < y1) {
                io.println(Math.sqrt((x-x2)*(x-x2) + (y-y1)*(y-y1)));
            } else {
                io.println(Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2)));
            }
        }
        else { //Case 4: goat is diagonally left of the house
            if (y < y1) {
                io.println(Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)));
            } else {
                io.println(Math.sqrt((x-x1)*(x-x1) + (y-y2)*(y-y2)));
            }
        }
        io.flush();
    }
}