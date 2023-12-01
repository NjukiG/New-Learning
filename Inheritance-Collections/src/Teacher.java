public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String getCareer() {
        return "I'm a teacher!";
    }
}