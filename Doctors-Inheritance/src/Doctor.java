public class Doctor {
    private String name;
    private String proffession;

    public Doctor(String name, String proffession){
        this.name= name;
        this.proffession = proffession;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setProffession(String proffession){
        this.proffession = proffession;
    }
    public String getProffession(){
        return proffession;
    }

    public void treatPatient(){
        System.out.println("Perform lab tests on patient!");
    }


    @Override
    public String toString(){
        return "Name: " + name + ", Proffession: " + proffession;
    }
}
