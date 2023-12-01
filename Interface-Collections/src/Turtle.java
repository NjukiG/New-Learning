public class Turtle implements Swimmable {

    private String breed;

    public Turtle(String breed) {
        this.breed = breed;
    }

    @Override
    public void swim() {
        System.out.printf("I'm a %s and I swim with my flippers!%n", breed);
    }
}