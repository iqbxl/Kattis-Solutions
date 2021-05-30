public class SoftPasswords {
    static String reverseCase(String input) {
        String res = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                res += Character.toUpperCase(input.charAt(i));
            } else {
                res += Character.toLowerCase(input.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String s = io.getWord(), p = io.getWord(); 
        String ans = "No";
        for (int i = 0; i < digits.length; i++) {
            if (s.equals(p + digits[i]) || s.equals(digits[i] + p)) {
                ans = "Yes";
                break;
            }
        }
        if (s.equals(p) || s.equals(reverseCase(p))) {
            ans = "Yes";
        } 
        io.print(ans);
        io.flush();
    }
}