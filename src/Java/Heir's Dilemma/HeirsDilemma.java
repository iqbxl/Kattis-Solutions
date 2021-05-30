public class HeirsDilemma {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int L = io.getInt();
        int H = io.getInt();
        int count = 0;
        for (int i = L; i <= H; i++) {
            if (different(i) && divisible(i)) {
                count++;
            }
        }
        io.print(count);
        io.flush();
    }

    public static boolean different(int n) { // check if all digits in a number are unique
        String s = Integer.toString(n);        // change int to string
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.substring(i, i + 1)) != s.lastIndexOf(s.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean divisible(int n) { // check if number is divisible by all digits
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(s.substring(i, i + 1)); // convert string back to int
            if (digit == 0) { // cannot be divisible by 0 (undefined)
                return false;
            } else if (digit != 0 && n % digit != 0) { // if number not divisible by digit
                return false;
            }
        }
        return true;
    }
}