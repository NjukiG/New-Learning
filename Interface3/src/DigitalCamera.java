public class DigitalCamera implements Camera {


    @Override
    public int numberOfPhotographs() {
        return 2000;
    }

    @Override
    public String takePhotograph(){
        return "Taking a picture on my digital camera!";
    }
}
