public class Trik {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        String string = io.getWord();
        int temp = 0; //temp represents the current position of the ball
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A' && temp != 2) { //ball cannot be in right cup (position 2)
                temp = -temp + 1; //logic must work for reverse as well
            } if (string.charAt(i) == 'B' && temp != 0) {
                temp = -temp + 3;
            } if (string.charAt(i) == 'C' && temp != 1) {
                temp = -temp + 2;
            }
        }
        io.println(temp + 1);
        io.flush();
    }
}