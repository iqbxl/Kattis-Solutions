import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class SavingDaylight {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = sc.readLine()) != null) {
            String[] arr = input.split(" ");
            dc.write(arr[0] + " " + arr[1] + " " + arr[2] + " ");
            
            int i = arr[3].indexOf(":");
            int h1 = Integer.parseInt(arr[3].substring(0, i));
            int m1 = Integer.parseInt(arr[3].substring(i + 1));

            int j = arr[4].indexOf(":");
            int h2 = Integer.parseInt(arr[4].substring(0, j));
            int m2 = Integer.parseInt(arr[4].substring(j + 1));

            int hours = h2 - h1;
            int min = m2 - m1;
            if (min < 0) {
                min += 60;
                hours -= 1;
            }
            dc.write(hours + " hours " + min + " minutes\n");
        }
        dc.close();
    }
}