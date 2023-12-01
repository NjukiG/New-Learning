import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Winston Bishop", 40),
                new Teacher("Jessica Day", 41),
                new PoliceOfficer("Winston Bishop", 40),
                new JavaDev("George", 32)
        ));

        for (Person person : personList) {
            System.out.println(person.getCareer());
        }
    }
}