public class FinalExam2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String[] answer = new String[n];
        int score = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = io.getWord();
        }
        for (int i = 0; i < n - 1; i++) {
            if (answer[i].equals(answer[i + 1])) {
                score++;
            }
        }
        io.print(score);
        io.flush();
    }
}