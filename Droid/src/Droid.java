public class Droid{
    String name;
    int batteryLevel;
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        return "Hello, I’m the droid: " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is perfoming a task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport(){
        System.out.println("Energy report: " + batteryLevel);
    }

    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("Dancing");
        Codey.energyReport();
    }
}