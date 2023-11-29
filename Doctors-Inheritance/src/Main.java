// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hELLO FROM DOCTORS");

        Doctor strange = new Doctor("Strange", "NeuroSurgeon");
        System.out.println(strange);
        strange.treatPatient();
        System.out.println();

        FamilyDoctor ramorie = new FamilyDoctor("Ramorie", "Family Doc");
        System.out.println(ramorie);
        ramorie.treatPatient();
        System.out.println(ramorie.givesAdvice());
        System.out.println();

        Surgeon hanniball = new Surgeon("Hanniball", "Crazy Surgeon", 30);
        System.out.println(hanniball);
        hanniball.treatPatient();
    }
}