public class GuessTheNumber {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int low = 1, high = 1000, mid = 500;
        io.println(mid);
        io.flush(); //make sure to flush standard out AFTER EACH GUESS
        
        while (true) { //main logic is to divide & conquer
            String input = io.getWord(); 
            if (input.equals("higher")) {
                low = mid + 1;
                mid = (low + high) / 2;
                io.println(mid);
                io.flush();
            } if (input.equals("lower")) {
                high = mid;
                mid = (low + high) / 2;
                io.println(mid);
                io.flush();
            } if (input.equals("correct"))
                break;
        }
    }
}