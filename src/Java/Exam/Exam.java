public class Exam {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int k = io.getInt();
        String myAnswers = io.getWord(), friendAnswers = io.getWord();
        int len = myAnswers.length(), result = 0;
        for (int i = 0; i < len; i++) {
             if (myAnswers.charAt(i) == friendAnswers.charAt(i)) {
                 result += 1;
             }
        }
        if (result > k) {
            result = (len - result) + k;
        } else {
            result = (len - k) + result;
        }
        io.println(result);
        io.flush();
    }
}