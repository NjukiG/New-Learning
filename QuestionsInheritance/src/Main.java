// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("Which sport has been played on the moon?", 7);
        q1.displayQuestion();

        System.out.println();
        TrueFalseQuestion q2 = new TrueFalseQuestion("NFL refs receive Super Bowl rings.", 2);
        q2.displayQuestion();

        System.out.println();
        TrueFalseQuestion q3 = new TrueFalseQuestion("Olympic gold metals are made of silver.", 3);
        q3.displayQuestion();

        System.out.println();
        MultipleChoiceQuestion q4 = new MultipleChoiceQuestion("Which team scored the most points in the 2018 season?", 5, new String[]{"Patriots", "Broncos", "Browns", "Steelers"});
//        q4.setChoices(new String[]{"Patriots", "Broncos", "Browns", "Steelers"});
        q4.displayQuestion();

        System.out.println();
        MultipleChoiceQuestion q5 = new MultipleChoiceQuestion("What sport did James Naismith invent?", 10, new String[]{"Football", "Basketball", "Baseball"});
        q5.displayQuestion();
    }
}