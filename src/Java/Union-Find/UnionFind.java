import java.io.*;

public class UnionFind {
    private int[] parents, treeS;
    public UnionFind(int elms) {
        parents = new int[elms];
        treeS = new int[elms];
        for (int i = 0; i < elms; i++) {
            parents[i] = i;
            treeS[i] = 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1024 * 1024);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        String line = in.readLine();
        int pos = line.indexOf(' ');
        int elms = Integer.parseInt(line.substring(0, pos));
        UnionFind unionF = new UnionFind(elms);
        int operations = Integer.parseInt(line.substring(pos + 1, line.length()));
        for (int i = 0; i < operations; i++) {
            line = in.readLine();
            char operator = line.charAt(0);
            pos = line.lastIndexOf(' ');
            if (operator == '=') {
                unionF.union(Integer.parseInt(line.substring(2, pos)), Integer.parseInt(line.substring(pos + 1, line.length())));
            } else {
                out.print(unionF.isConnected(Integer.parseInt(line.substring(2, pos)), Integer.parseInt(line.substring(pos + 1, line.length()))) ? "yes" + System.lineSeparator() : "no" + System.lineSeparator());
            }
        }
        out.flush();
    }
    public void union(int elemA, int elemB) {
        int root_A = find(elemA);
        int root_B = find(elemB);
        if (root_A == root_B) {
            return;
        }
        if (treeS[root_A] < treeS[root_B]) {
            suppress(root_A, root_B);
        } else {
            suppress(root_B, root_A);
        }
    }
    private void suppress(int slave, int master) {
        parents[slave] = master;
        treeS[master] += treeS[slave];
    }
    
    public int find(int element) {
        int root = element;
        while (root != parents[root]) {
            root = parents[root];
        }
        return root;
    }
    public int find_s(int element) {
        if (element == parents[element]) {
            return element;
        } else {
            int root = find(parents[element]);
            parents[element] = root;
            return root;
        }
    }
    public boolean isConnected(int elemA, int elemB) {
        return find(elemA) == find(elemB);
    }
}