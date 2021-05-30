public class MissingNumbers {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), last = 0;
        int[] nums = new int[201];
        for (int i = 0; i < n; i++) {
            int number = io.getInt();
            nums[number] = number;
            if (i == n - 1) {
                last = number;
            }
        }
        int check = 0;
        for (int i = 1; i <= last; i++) {
            if (nums[i] != i) {
                io.println(i);
                check++;
            } 
        }
        if (check == 0) {
            io.print("good job");
        }
        io.flush();
    }
}