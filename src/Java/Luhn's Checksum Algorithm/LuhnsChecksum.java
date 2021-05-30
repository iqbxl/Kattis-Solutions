public class LuhnsChecksum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            String number = io.getWord();
            StringBuilder str = new StringBuilder();
            str = str.append(number).reverse();
            number = str.toString();
            int sum = 0;
            for (int j = 0; j < number.length(); j++) {
                if (j % 2 == 0) {
                    sum += Integer.parseInt(number.substring(j, j + 1));
                } else {
                    int odd = 2 * Integer.parseInt(number.substring(j, j + 1));
                    if (String.valueOf(odd).length() == 2) {
                        odd = odd / 10 + odd % 10;
                    }
                    sum += odd;
                }
            }
            io.println(sum % 10 == 0 ? "PASS" : "FAIL");
        }
        io.flush();
    }
}