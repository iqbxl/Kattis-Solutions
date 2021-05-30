public class Team {
    public long id;
    public long penalty;
    public long solved;

    public Team(long id) {
        this.id = id;
        this.penalty = 0;
        this.solved = 0;
    }

    public long getId() {
        return id;
    }

    public long getPenalty() {
        return penalty;
    }

    public void addPenalty(long newPenalty) {
        penalty += newPenalty;
    }

    public long getSolved() {
        return solved;
    }

    public void incSolved() {
        solved += 1;
    }
}