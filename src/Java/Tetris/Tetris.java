public class Tetris {
    
    // all possible patterns of the seven pieces in a 3-D array
    // reference point of the lowest cell in the column is relative to the first column
    private static int[][][] permutations = {
        {{0}, {0, 0, 0, 0}},
        {{0, 0}},
        {{0, 0, 1}, {0, -1}},
        {{0, -1, -1}, {0, 1}},
        {{0, 0, 0}, {0, 1}, {0, -1, 0}, {0, -1}},
        {{0, 0, 0}, {0, 0}, {0, 1, 1}, {0, -2}},
        {{0, 0, 0}, {0, 2}, {0, 0, -1}, {0, 0}}
    };
    
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int c = io.getInt();
        int p = io.getInt() - 1;
        int[] heights = new int[c];
        for (int i = 0; i < c; i++) {
            heights[i] = io.getInt();
        }
        int ans = 0;
        for (int[] pattern : permutations[p]) { // access the right piece out of the seven, then access each sub-array
loop:
            for (int i = 0; i + pattern.length <= c; i++) {
                for (int j = 0; j < pattern.length; j++) {
                    if (heights[i + j] != heights[i] + pattern[j]) {
                        continue loop;
                    }
                }
                ans++;
            }
        }
        io.print(ans);
        io.flush();
    }
}