public class SecretMessage {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String message = io.getWord();
            int oriLen = message.length();
            int len = (int) Math.ceil(Math.sqrt(oriLen));
            int pad = len * len - oriLen;
            for (int j = 0; j < pad; j++) {
                message += "*";
            }
            char[][] arr = new char[len][len];
            int k = 0;
            for (int a = len - 1; a >= 0; a--) { // fill up 2d array from right most column first top down
                for (int b = 0; b < len; b++) {
                    arr[b][a] = message.charAt(k);
                    k++;
                }
            }
            String res = "";
            for (int p = 0; p < len; p++) {
                for (int q = 0; q < len; q++) {
                    if (arr[p][q] != '*') { // get result without asterisks
                        res += arr[p][q];
                    }
                }
            }
            io.println(res);
        }
        io.flush();
    }
}