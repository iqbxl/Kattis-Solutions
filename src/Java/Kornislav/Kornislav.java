import java.util.Arrays;

public class Kornislav {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = io.getInt();
        }
        Arrays.sort(nums);
        io.print(nums[0] * nums[2]);
        io.close();
    }
}