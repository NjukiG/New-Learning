public class Main {
    public static void main(String[] args) {
        System.out.println("Hello\n");

        CameraFactory NikonFactory = new CameraFactory();

        Camera polaroid = NikonFactory.createNewCamera("POLAROID");
        Camera digital = NikonFactory.createNewCamera("DIGITAL");
        Camera phone = NikonFactory.createNewCamera("PHONE");

        polaroid.takePhotograph();
        digital.takePhotograph();
        phone.takePhotograph();

    }
}