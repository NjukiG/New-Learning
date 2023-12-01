public class PoliceOfficer extends Person {

    public PoliceOfficer(String name, int age) {
        super(name, age);
    }

    @Override
    public String getCareer() {
        return "I'm a police officer!";
    }
}