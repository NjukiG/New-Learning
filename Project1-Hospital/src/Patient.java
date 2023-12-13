public class Patient {

    private String name;
    private String ailment;

    public Patient(String name, String ailment) {
        this.name = name;
        this.ailment = ailment;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", ailment='" + ailment + '\'' +
                '}';
    }
}
