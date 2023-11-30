import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Instantiate a list of Camera objects
        List<Camera> myCameras = new ArrayList<>();

        myCameras.add(new PhoneCamera());
        myCameras.add(new DigitalCamera());
        myCameras.add(new DigitalCamera());
        myCameras.add(new PolaroidCamera());

        int average = calculateAverage(myCameras);
        System.out.printf("The average number of photographs I can take is %d%n", average);

        takePhotographs(myCameras);


    }

    public static int calculateAverage(List<Camera> cameras) {
        // Task Two - Iterate through the list and find the average number of photographs
        double total = 0;
      for(Camera camera: cameras){
          total += camera.numberOfPhotographs();

      }
        return (int) (total / cameras.size());
    }

    public static void takePhotographs(List<Camera> cameras) {
        // Task Three - Iterate through a list of Camera objects and "take a photograph" with each camera
        for(Camera camera: cameras){
            System.out.println(camera.takePhotograph());
        }
    }
}