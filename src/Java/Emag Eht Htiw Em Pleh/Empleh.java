public class Empleh {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String rowSeparator = "+---+---+---+---+---+---+---+---+";
        String[] board = {"|:::|...|:::|...|:::|...|:::|...|",
            "|...|:::|...|:::|...|:::|...|:::|",
            "|:::|...|:::|...|:::|...|:::|...|",
            "|...|:::|...|:::|...|:::|...|:::|",
            "|:::|...|:::|...|:::|...|:::|...|",
            "|...|:::|...|:::|...|:::|...|:::|",
            "|:::|...|:::|...|:::|...|:::|...|",
            "|...|:::|...|:::|...|:::|...|:::|"};
        
        String line = io.getLine();
        if (line.length() > 7) {
            String[] whitePieces = line.substring(7).split(",");
            for (int i = 0; i < whitePieces.length; i++) {
                String id = whitePieces[i].length() == 3 ? whitePieces[i].substring(0, 1) : "P"; // for white, use capital
                int col = whitePieces[i].length() == 3 ? whitePieces[i].charAt(1) - 'a' : whitePieces[i].charAt(0) - 'a';
                String originalRow = board[whitePieces[i].charAt(whitePieces[i].length() - 1) - '1'];
                String newRow = originalRow.substring(0, 4 * col + 2) + id + originalRow.substring(4 * col + 3); //insert id
                board[whitePieces[i].charAt(whitePieces[i].length() - 1) - '1'] = newRow; // replace in board
            }
        }
        
        line = io.getLine();
        if (line.length() > 7) {
            String[] blackPieces = line.substring(7).split(",");
            for (int i = 0; i < blackPieces.length; i++) {
                String id = blackPieces[i].length() == 3 ? blackPieces[i].substring(0, 1).toLowerCase() : "p";
                int col = blackPieces[i].length() == 3 ? blackPieces[i].charAt(1) - 'a' : blackPieces[i].charAt(0) - 'a';
                String originalRow = board[blackPieces[i].charAt(blackPieces[i].length() - 1) - '1'];
                String newRow = originalRow.substring(0, 4 * col + 2) + id + originalRow.substring(4 * col + 3); //insert id
                board[blackPieces[i].charAt(blackPieces[i].length() - 1) - '1'] = newRow; // replace in board
            }
        }

        io.println(rowSeparator);
        for (int i = 7; i >= 0; i--) {
            io.println(board[i] + "\n" + rowSeparator);
        }
        io.flush();
    }
}