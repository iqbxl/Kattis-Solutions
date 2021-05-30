public class RightOfWay {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        
        String a = io.getWord(); // where you arrive from
        String b = io.getWord(); // where you want to turn
        String c = io.getWord(); // where other vehicles come from

        String straight = getStraight(a);
        String left = getLeft(a);
        String right = getRight(a);

        if (straight.equals(b)) { // means car going opp direction
            if (right.equals(c)) { // check for cars coming from the right
                io.print("Yes");
            } else {
                io.print("No");
            }
        } else if (left.equals(b)) {
            if (straight.equals(c) || right.equals(c)) {
                io.print("Yes");
            } else {
                io.print("No");
            }
        } else {
            io.print("No");
        }
        io.flush();
    }

    private static String getStraight(String a) {
        String dir = "";
        if (a.equals("North")) {
            dir = "South";
        } else if (a.equals("East")) {
            dir = "West";
        } else if (a.equals("South")) {
            dir = "North";
        } else {
            dir = "East";
        }
        return dir;
    }

    private static String getLeft(String a) {
        String dir = "";
        if (a.equals("North")) {
            dir = "East";
        } else if (a.equals("East")) {
            dir = "South";
        } else if (a.equals("South")) {
            dir = "West";
        } else {
            dir = "North";
        }
        return dir;
    }

    private static String getRight(String a) {
        String dir = "";
        if (a.equals("North")) {
            dir = "West";
        } else if (a.equals("East")) {
            dir = "North";
        } else if (a.equals("South")) {
            dir = "East";
        } else {
            dir = "South";
        }
        return dir;
    }
}