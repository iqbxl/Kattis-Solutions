public class Autori {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        String word = io.getWord();
        String parts[] = word.split("-");
        String abbrv = "";
        for (int i = 0; i < parts.length; i++) {
            abbrv += parts[i].charAt(0);
        }
        io.println(abbrv);
        io.flush();
    }
}