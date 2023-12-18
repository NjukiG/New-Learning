

enum Status {
    Running, Failed, Pending, Success;
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        for(Status status: Status.values()){
//            System.out.println(status);
//        };
        Status status = Status.Success;

        switch (status){
            case Running:
                System.out.println("We are currently " + status);
                break;
            case Pending:
                System.out.println("Please wait: " + status);
                break;
            case Failed:
                System.out.println("Program crushed: " + status);
                break;
            case Success:
                System.out.println("We are live: " + status);
                break;
            default:
                System.out.println("Out of the switch");
        }

    }
}