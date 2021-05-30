public class MapTiles2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String s = io.getWord();
        int len = s.length();
        int x = 0, y = 0;
        for (int i = 0; i < len; i++) {
            x *= 2; // multiply x and y by 2 at the next level 
            y *= 2;
            if (s.charAt(i) == '1') {
                x++;
            } else if (s.charAt(i) == '2') {
                y++;
            } else if (s.charAt(i) == '3') {
                x++;
                y++;
            } // if s.charAt(0) == '0', dont do anything
        }
        io.println(len + " " + x + " " + y);
        io.flush();
    }
}