public class SevenWonders {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String word = io.getWord();
        int length = word.length();
        int T = length - word.replaceAll("T", "").length(); //remove all occurences of char "T"
        int C = length - word.replaceAll("C", "").length(); //"                               "
        int G = length - word.replaceAll("G", "").length(); //"                               "
        io.print(T * T + C * C + G * G + (7 * Math.min(Math.min(T, C),  G)));
        io.flush();
    }
}