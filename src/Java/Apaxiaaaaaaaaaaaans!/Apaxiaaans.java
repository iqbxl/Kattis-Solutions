public class Apaxiaaans {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        char name[] = io.getWord().toCharArray(); //want to build a char array of initial word
        String result = "";
        char prev = ' ';
        for (char c : name) {
            if (c != prev) {
                result += c;
                prev = c;
            }
        }
        io.println(result);
        io.flush();
    }
}