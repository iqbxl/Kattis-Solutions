import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class GCPC {
    static HashSet<Team> betterThanOne;
    static HashMap<Long, Team> teams;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        long numOfTeams = io.getLong();
        long events = io.getLong();
        betterThanOne = new HashSet<Team>();
        teams = new HashMap<Long, Team>();
        for (long i = 1; i <= numOfTeams; i++) {
            Team team = new Team(i);
            teams.put(team.getId(), team);
        }
        for (long i = 0; i < events; i++) {
            long teamId = io.getLong();
            long penalty = io.getLong();
            Team team = teams.get(teamId);
            long rank = method(team, penalty);
            io.println(rank);
            io.flush();
        }
        io.close();
    }
    
    public static long method(Team team, long penalty) {
        long id = team.getId();
        if (id != (long)1) {
            long longOne = (long)1;
            Team one = teams.get(longOne);
            team.incSolved();
            team.addPenalty(penalty);
            if (compare(team, one)) { //true if team is better than one
                betterThanOne.add(team);
            }
        } else {
            team.incSolved();
            team.addPenalty(penalty);
            ArrayList<Long> worseThanOne = new ArrayList<Long>();
            for (Team x : betterThanOne) { 
                if (!compare(x, team)) { 
                    worseThanOne.add(x.getId());
                }
            }
            for (long i : worseThanOne) {
                betterThanOne.remove(teams.get(i));
            }
        }
        return (betterThanOne.size() + 1);
    }
    
    public static boolean compare(Team team, Team one) { //compare function
        boolean result = false; 
        if (team.getSolved() > one.getSolved()) {
            result = true;
        } else if (team.getSolved() == one.getSolved()) {
            if (team.getPenalty() < one.getPenalty()) {
                result = true;
            }
        }
        return result;
    }
}