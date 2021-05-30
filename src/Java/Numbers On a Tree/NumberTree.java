import java.util.Scanner;

public class NumberTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        if (input.length > 1) {
            int h = Integer.parseInt(input[0]);
            String path = input[1];
            int cur = 0; // initialized to index 0 at root
            for (char c : path.toCharArray()) {
                if (c == 'L') {
                    cur = cur * 2 + 1;
                } else {
                    cur = cur * 2 + 2;
                }
            }
            // Root value for perfect binary tree is 2 ^ (h + 1) - 1
            System.out.println((1 << h + 1) - 1 - cur);
        } else {
            int h = Integer.parseInt(input[0]);
            System.out.println((1 << h + 1) - 1);
        }
        sc.close();
    }
}