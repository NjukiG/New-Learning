public class HockeyPlayer extends Athlete {
    private int goals;
    private int penalties;

    public HockeyPlayer(int jerseyNumber, int goals, int penalties) {
        super(jerseyNumber);
        this.goals = goals;
        this.penalties = penalties;
    }

    public HockeyPlayer(int jerseyNumber, int goals) {
        super(jerseyNumber);
        this.goals = goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public int getGoals() {
        return goals;
    }

    public int getPenalties() {
        return penalties;
    }


    @Override
    public int getRating() {
        return (goals * 4) - (penalties * 2);
    }
}
