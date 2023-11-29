public class MultipleChoiceQuestion extends Question {
    private String[] choices;

    public MultipleChoiceQuestion(String text, int points, String[] choices) {
        super(text, points);
        this.choices = choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public String[] getChoices() {
        return choices;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText() + " (" + getPoints() + " points)");
        int num = 1;

        for (String choice : choices) {
            System.out.println("(" + num + ") " + choice);
            num += 1;
        }


    }
}
