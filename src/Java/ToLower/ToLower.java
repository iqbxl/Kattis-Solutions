public class ToLower {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        int t = io.getInt();
        int count  = 0;
        while (p-- > 0) {
            boolean check = true;
            for (int i = 0; i < t; i++) {
                String input = io.getWord();
                String temp = input.substring(1, input.length());
                String toLower = temp.toLowerCase();
                if (!temp.equals(toLower)) {
                    check = false;
                }
            }
            if (check == true) {
                count++;
            }
        }
        io.print(count);
        io.flush();
    }
}