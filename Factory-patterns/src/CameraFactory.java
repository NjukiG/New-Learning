public class CameraFactory {

    public Camera createNewCamera(String type){
      switch (type.toLowerCase()){
          case "polaroid":
              return new PolaroidCamera();
          case "phone":
              return new PhoneCamera();
          case "digital":
              return new DigitalCamera();
          default:
              throw new IllegalArgumentException("Invalid camera type: " + type);
      }
    }
}
