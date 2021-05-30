public class RedRover {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String s = io.getWord();
        int min = s.length();
        for (int i = 0; i < s.length(); i++) { // brute force approach, check every substring
            for (int j = i + 1; j < s.length(); j++) {
                String temp = s.substring(i, j);
                String replaced = s.replace(temp, "M");
                min = Math.min(min, replaced.length() + temp.length());
            }
        }
        io.print(min);
        io.flush();
    }
}