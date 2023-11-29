public class Question {
    private String text;
    private int points;

    public Question(String text, int points){
        this.text = text;
        this.points = points;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getText(){
        return text;
    }

    public int getPoints(){
        return points;
    }

    public void displayQuestion() {
        System.out.println(text + " (" + points + " points)");
    }

}
