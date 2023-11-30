public class FootballPlayer extends Athlete{

    private int touchdowns;

    public FootballPlayer(int jerseyNumber, int touchdowns){
        super(jerseyNumber);
        this.touchdowns = touchdowns;
    }

    public void setTouchdowns(int touchdowns){
        this.touchdowns = touchdowns;
    }

    public int getTouchdowns(){
        return touchdowns;
    }

    @Override
    public int getRating(){
        return touchdowns * 5;
    }
}
