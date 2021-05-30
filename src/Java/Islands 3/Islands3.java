import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Islands3 {
    static int r, c;
    static char[][] arr;
    static boolean[][] hasVisited;

    static int[] dx = {0, 0, -1, 1}, dy = {-1, 1, 0, 0};

    static void bfs(Land start) {
        Deque<Land> dq = new ArrayDeque<>();
        dq.offer(start);
        while (!dq.isEmpty()) {
            Land land = dq.poll();
            if (hasVisited[land.r][land.c]) {
                continue;
            }
            hasVisited[land.r][land.c] = true;
            for (int i = 0; i < dx.length; i++) {
                int R = land.r + dx[i];
                int C = land.c + dy[i];
                if (R < 0 || C < 0 || R >= r || C >= c || arr[R][C] == 'W') {
                    continue;
                }
                dq.offer(new Land(R, C));
            }
        }
    }

    static class Land {
        int r, c;

        public Land(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        arr = new char[r][c];
        hasVisited = new boolean[r][c];
        Deque<Land> dq = new ArrayDeque<>();
        for (int i = 0; i < r; i++) {
            String row = sc.next();
            for (int j = 0; j < c; j++) {
                arr[i][j] = row.charAt(j);
                if (arr[i][j] == 'L') {
                    dq.offer(new Land(i, j));
                }
            }
        }
        int count = 0;
        while (!dq.isEmpty()) {
            Land land = dq.poll();
            if (hasVisited[land.r][land.c]) {
                continue;
            }
            bfs(land);
            count++;
        }
        System.out.println(count);
        sc.close();
    }    
}