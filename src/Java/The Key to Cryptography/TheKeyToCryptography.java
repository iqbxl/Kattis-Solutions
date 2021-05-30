public class TheKeyToCryptography {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String ciphertext = io.getWord();
        String secretword = io.getWord();
        String message = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            int check = ciphertext.charAt(i) - (secretword.charAt(i) - 'A'); // ASCII value of 'A' is 65 (lowest)
            if (check > 64) {
                char decodedletter = (char) check;
                message += decodedletter;
                secretword += decodedletter;
            } else {
                char decodedletter = (char) ('[' - ('A' - check)); // since check is below 65, find the difference in 
                message += decodedletter;                          // ASCII value with 'A'. '[' is 1 higher than 'Z'
                secretword += decodedletter;
            }
        }
        io.print(message);
        io.flush();
    }
}