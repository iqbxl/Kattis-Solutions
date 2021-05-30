import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.print(set.size() == s.length() ? 1 : 0);
        sc.close();
    }
}