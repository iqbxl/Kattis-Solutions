import java.util.List;
import java.util.ArrayList;

public class CoconutSplat {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int syllables = io.getInt();
        int numOfPlayers = io.getInt();
        // State: 0, 1, 2, Player: #
        List<Pair<Integer, Integer>> players = new ArrayList<Pair<Integer, Integer>>();
        for (int i = 1; i <= numOfPlayers; i++) {
            players.add(new Pair<Integer, Integer>(0, i)); // fill arraylist with default pairs first
        }
        int index = 0;
        while (players.size() > 1) {
            index = (index + syllables - 1) % players.size();
            if (players.get(index).first == 0) {
                players.get(index).first = 1;
                players.add(index, new Pair<Integer, Integer>(1, players.get(index).second));
            } else if (players.get(index).first == 1) {
                players.get(index).first = 2;
                index++;
            } else { // == 2 (palm out hence, is removed)
                players.remove(index);
            }
        }
        io.print(players.get(0).second);
        io.flush();
    }
}