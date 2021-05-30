public class FizzBuzz {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt(), y = io.getInt(), n = io.getInt();
        for (int i = 1; i < n + 1; i++) {
            if (i % x != 0 && i % y != 0) {
                io.println(i);
            } else if (i % x == 0 && i % y != 0) {
                io.println("Fizz");
            } else if (i % x != 0 && i % y == 0) {
                io.println("Buzz");
            } else {
                io.println("FizzBuzz");
            }
        }
        io.flush();
    }
}