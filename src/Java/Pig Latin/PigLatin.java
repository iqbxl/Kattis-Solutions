import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class PigLatin {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = sc.readLine()) != null) {
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                String firstLetter = arr[i].substring(0,1);
                if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i")
                || firstLetter.equals("o") || firstLetter.equals("u") || firstLetter.equals("y")) {
                    dc.write(arr[i] + "yay ");
                } else {
                    int aIdx = arr[i].indexOf("a") == -1 ? 50 : arr[i].indexOf("a");
                    int eIdx = arr[i].indexOf("e") == -1 ? 50 : arr[i].indexOf("e");
                    int iIdx = arr[i].indexOf("i") == -1 ? 50 : arr[i].indexOf("i");
                    int oIdx = arr[i].indexOf("o") == -1 ? 50 : arr[i].indexOf("o");
                    int uIdx = arr[i].indexOf("u") == -1 ? 50 : arr[i].indexOf("u");
                    int yIdx = arr[i].indexOf("y") == -1 ? 50 : arr[i].indexOf("y");
                    int minIdx = Math.min(Math.min(Math.min(Math.min(Math.min(aIdx, eIdx), iIdx), oIdx), uIdx), yIdx);
                    dc.write(arr[i].substring(minIdx, arr[i].length()) + arr[i].substring(0, minIdx) + "ay ");
                }
            }
            dc.write("\n");
        }
        dc.close();
    }
}