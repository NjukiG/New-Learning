import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Main World!");
        System.out.println("Enter a name of a hospital you'd like to create!");
        Scanner scanner = new Scanner(System.in);
        String hospitalName = scanner.nextLine();

        Hospital hospital = new Hospital(hospitalName);

        List<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("ENter a docorts name to add to your hospital!");
            String docName = scanner.nextLine();

            System.out.println("Enter a specialty for this doctor!");
            String docSpecialty = scanner.nextLine();

            Doctor doctor = new Doctor(docName, docSpecialty);
            doctors.add(doctor);
            hospital.addDoctor(doctor);

            System.out.println("You added a new doctor, " + docName + " with a spcialty of, " + docSpecialty);
        }

        List<Patient> patients = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            System.out.println("Enter a Patient name!");
            String patientName = scanner.nextLine();

            System.out.println("ENter a patient's ailment matching the docotr's specialy they'll visit!");
            String patientAilment = scanner.nextLine();

            Patient patient = new Patient(patientName, patientAilment);
            patients.add(patient);
            System.out.println("Added a patient, " + patientName);

            for(Doctor doctor: doctors){
                if(doctor.getSpecialty().equalsIgnoreCase(patientAilment)){
                    doctor.addPatient(patient);
                    break;
                }
            }

        }

        System.out.println("\nHospital Information:");
        System.out.println(hospital);

        System.out.println("\nDoctors Information:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        System.out.println("\nPatients Information:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }


    }
}