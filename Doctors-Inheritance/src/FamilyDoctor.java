public class FamilyDoctor extends Doctor{

    public FamilyDoctor(String name, String proffession) {
        super(name, proffession);
    }

    public String givesAdvice(){
        return "JUst take your vitamins and I'll see you soon for the next session.";
    }

    @Override
    public void treatPatient(){
        System.out.println("CHeck patient's temp, bp and other minor things.");
    }
}
