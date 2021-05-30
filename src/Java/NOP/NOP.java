import java.util.Scanner;

public class NOP {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int count = 0;
        int idxUpper = 0;
        for (int i = 1; i < input.length; i++) {
            if (Character.isUpperCase(input[i])) {
                int temp = i - idxUpper;
                if (temp % 4 != 0) {
                    count += 4 - (temp % 4);
                    idxUpper = i;
                }
            }
        }
        System.out.print(count);
        sc.close();
    }
}