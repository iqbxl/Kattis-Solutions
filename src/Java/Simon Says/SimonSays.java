public class SimonSays {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String s = io.getLine();
            if (s.startsWith("Simon says")) {                //s.contains() also can
                io.println(s.substring(11, s.length())); //start at index 11, which is
            }                                                //the word after "Simon says"
        }
        io.flush();
    }
}