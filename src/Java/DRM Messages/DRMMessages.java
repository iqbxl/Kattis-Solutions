public class DRMMessages {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] letters = alphabets.toCharArray();
        String input = io.getWord();
        String first = input.substring(0, input.length() / 2);
        String second = input.substring(input.length() / 2, input.length());
        int countFirst = 0, countSecond = 0;
        for (int i = 0; i < first.length(); i++) {
            countFirst += alphabets.indexOf(first.charAt(i));
            countSecond += alphabets.indexOf(second.charAt(i));
        }
        String newFirst = "", newSecond = "";
        for (int i = 0; i < first.length(); i++) {
            newFirst += alphabets.charAt((alphabets.indexOf(first.charAt(i)) + countFirst) % 26);
            newSecond += alphabets.charAt((alphabets.indexOf(second.charAt(i)) + countSecond) % 26);
        }
        String res = "";
        for (int i = 0; i < first.length(); i++) {
            res += alphabets.charAt((alphabets.indexOf(newFirst.charAt(i))
                 + alphabets.indexOf(newSecond.charAt(i))) % 26);
        }
        io.print(res);
        io.flush();
    }
}