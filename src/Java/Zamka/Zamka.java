public class Zamka {
    public static int sumDigits(int x) {
        if (x == 0) {
            return x;
        } else { 
            return sumDigits(x / 10) + (x % 10); //use a recursive call
        }
    }
    
    public static void main(String args[]) { //idea is to use 2 for-loops for both extreme ends
        Kattio io = new Kattio(System.in);
        int L = io.getInt(), D = io.getInt(), X = io.getInt(), min = 0, max = 0;
        for (int i = L; i <= D; i++) {
               if (sumDigits(i) == X) {
                   min = i;
                   break; //break the loop once min value is obtained
               }
        }
        for (int i = D; i >= L; i--) {
            if (sumDigits(i) == X) {
                max = i;
                break; //break the loop once max value is obtained
            }
        }
        io.println(min);
        io.println(max);
        io.flush();
    }
}