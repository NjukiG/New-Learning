import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = prompt.nextLine();

        Student student1 = new Student(name);

        System.out.println("Hi " + name + "! What grade did you get on the test?");
        int grade = prompt.nextInt();

        student1.calculateGrade(grade);

    }
}