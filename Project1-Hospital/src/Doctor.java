import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String name;
    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", patients=" + patients +
                '}';
    }
}
