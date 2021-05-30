public class OwlAndFox {
    
    public static int sumOfDigits(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            int n = io.getInt();
            int sum = sumOfDigits(n);
            int ans = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (sumOfDigits(j) == sum - 1) {
                    ans = j;
                    break;
                }
            }
            io.println(ans);
        }
        io.flush();
    }
}