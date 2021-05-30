public class Greetings2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        int numOfEs = input.length() - 2;
        int intendedNumOfEs = numOfEs * 2;
        String res = "h";
        for (int i = 0; i < intendedNumOfEs; i++) {
            res += "e";
        }
        io.print(res + "y");
        io.flush();
    }
}