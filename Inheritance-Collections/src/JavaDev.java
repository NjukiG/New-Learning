public class JavaDev extends Person{

    public JavaDev(String name, int age){
        super(name, age);
    }


    @Override
    public String getCareer(){
        return "Im just a Java Developer in training!";
    }
}
