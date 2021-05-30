public class Kemija {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String result = "";
        while (io.hasMoreTokens()) {
            String word = io.getWord();
            word = word.replace("apa", "a");
            word = word.replace("epe", "e");
            word = word.replace("ipi", "i");
            word = word.replace("opo", "o");
            word = word.replace("upu", "u");
            result += word + " ";
        }
        io.print(result.trim()); //result.trim() eliminates leading and trailing spaces
        io.flush();
    }
}