import java.math.BigInteger;

public class Buka {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String a = io.getWord();
        BigInteger firstOperand = new BigInteger(a);
        String operator = io.getWord();
        String b = io.getWord();
        BigInteger secondOperand = new BigInteger(b);
        BigInteger ans;
        if (operator.equals("*")) {
            ans = firstOperand.multiply(secondOperand);
            io.print(ans);
        } else {
            ans = firstOperand.add(secondOperand);
            io.print(ans);
        }
        io.flush();
    }
}