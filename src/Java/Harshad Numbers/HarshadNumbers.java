public class HarshadNumbers {
    public static int sumofdigits(int x) {
        int result = 0;
        while (x != 0) { //while loop to calculate sum of digits
            result += x % 10;
            x = x / 10;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (!(n % sumofdigits(n) == 0)) {
            n++;
        }
        io.print(n);
        io.flush();
    }
}