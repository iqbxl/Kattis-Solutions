import java.util.Scanner;

public class LaptopSticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wc = sc.nextInt();
        int hc = sc.nextInt();
        int ws = sc.nextInt();
        int hs = sc.nextInt();
        System.out.println(wc > ws + 1 && hc > hs + 1 ? 1 : 0);
        sc.close();
    }
}