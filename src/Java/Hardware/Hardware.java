import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hardware {

    public static void print(int[] freq) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += freq[i];
            System.out.println("Make " + freq[i] + " digit " + i);
        }
        System.out.println(sum == 1 ? "In total 1 digit" : "In total " + sum + " digits");
    }
    
    public static boolean isNumeric(String input) {
        boolean numeric = true;
        for (int i = 0; i < input.length(); i++) {
            if (! Character.isDigit(input.charAt(i))) {
                numeric = false;
                break;
            }
        }
        return numeric;
    }

    public static String next(String street, BufferedReader br) throws IOException {
        if (street == null) {
            street = br.readLine();
        }
        System.out.println(street);
        System.out.println(br.readLine());
        int[] freq = new int[10];
        String line;
        while ((line = br.readLine()) != null) {
            if (line.substring(0, 1).equals("+") && line.substring(1, 2).equals(" ")) {
                String[] temp = line.split(" ");
                int start = Integer.parseInt(temp[1]);
                int end = Integer.parseInt(temp[2]);
                int step = Integer.parseInt(temp[3]);
                for (int i = start; i <= end; i += step) {
                    for (int j = 0; j < Integer.toString(i).length(); j++) {
                        freq[Integer.parseInt(Integer.toString(i).substring(j, j + 1))]++;
                    }
                }
            } else if (isNumeric(line)) {
                for (int i = 0; i < line.length(); i++) {
                    freq[Integer.parseInt(line.substring(i, i + 1))]++;
                }
            } else {
                print(freq);
                return line;
            }
        }
        print(freq);
        br.close();
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String street = null;
        while (true) {
            street = next(street, br);
            if (street == null) {
                break;
            }
        }
        br.close();
    }
}