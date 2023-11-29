public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String text, int points) {
        super(text, points);
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText() + " (" +getPoints() + " points)");
        System.out.println("(1) True");
        System.out.println("(2) False");
    }
}
