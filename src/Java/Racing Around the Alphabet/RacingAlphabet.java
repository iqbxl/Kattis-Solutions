public class RacingAlphabet {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String aphorism = io.getLine();
            int sum = 0, init = letters.indexOf(aphorism.charAt(0)); //use indexOf() method of string
            for (int j = 1; j < aphorism.length(); j++) {
                int current = letters.indexOf(aphorism.charAt(j));
                int len1 = Math.abs(current - init), len2 = 28 - len1;
                sum += Math.min(len1, len2); //find the minimum of the two lengths
                init = current; //update prev value
            }
            io.println(aphorism.length() + (Math.PI * 60 / 28) * sum / 15);
        }
        io.flush();
    }
}