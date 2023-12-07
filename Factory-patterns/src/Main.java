// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        CameraFactory NikonFactory = new CameraFactory();

        Camera polaroid = NikonFactory.createNewCamera("POLAROID");
        Camera digital = NikonFactory.createNewCamera("DIGITAL");
        Camera phone = NikonFactory.createNewCamera("PHONE");

        polaroid.takePhotograph();
        digital.takePhotograph();
        phone.takePhotograph();

    }
}