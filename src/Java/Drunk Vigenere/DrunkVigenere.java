public class DrunkVigenere {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encrypted = io.getWord();
        String key = io.getWord();
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            int idxEnc = alphabet.indexOf(encrypted.charAt(i));
            int idxKey = alphabet.indexOf(key.charAt(i));
            int newIdx = 0;
            if (i % 2 == 0) {
                newIdx = idxEnc - idxKey;
                if (newIdx < 0) {
                    decrypted += (char)(newIdx + 26 + 65);
                } else {
                    decrypted += (char)(newIdx + 65);
                }
            } else {
                newIdx = idxEnc + idxKey;
                decrypted += (char)(newIdx % 26 + 65);
            }
        }
        io.print(decrypted);
        io.flush();
    }
}