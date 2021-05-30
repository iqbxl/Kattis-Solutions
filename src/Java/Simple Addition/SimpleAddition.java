import java.util.Scanner;
import java.math.BigInteger;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        System.out.println(A.add(B));
        sc.close();
    }
}