// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Person plumber = new Person("Kamau", 32);


        System.out.println("Plumber state: " + plumber);
        System.out.println(plumber.getName() + " is a plumber aged " + plumber.getAge());
        System.out.println(plumber.weekendPlan());
        System.out.println();

        Teacher teacher = new Teacher("Mbithi", 40, "Computer Science");
        System.out.println("Teacher state " + teacher);
        System.out.println(teacher.getName() + " is a teacher aged " + teacher.getAge() + " and teaches" + teacher.getSubjectTaught());
        System.out.println(teacher.getName() + teacher.weekendPlan());
        System.out.println();

        Student george = new Student("George", 31, "Java Programming");
        System.out.println("Student state: " + george);
        System.out.println(george.getName() + george.weekendPlan());
        System.out.println(george.getName() + "'s favourite subject is " + george.getFavouriteSubject());



    }
}