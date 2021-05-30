public class Mjehuric {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = io.getInt();
        }
        int n = numbers.length;
outerloop:
        for (int i = 0; i < n - 1; i++) {         // Bubble sort code
            for (int j = 0; j < n - i - 1; j++) { // Worst case: no of iterations = 4+3+2+1 = 10
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];        // Implement swapping of elements in array
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    String res = "";
                    for (int num : numbers) {
                        res += num + " ";
                    }
                    res = res.trim();
                    io.println(res);
                    if (res.equals("1 2 3 4 5")) break outerloop;
                }
            }
        }
        io.flush();
    }
}