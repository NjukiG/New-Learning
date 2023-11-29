public class Student extends Person {
    private String favouriteSubject;

    public Student(){
        super();
    }

    public Student(String name, int age, String favouriteSubject){
        super(name, age);
        this.favouriteSubject = favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject){
        this.favouriteSubject = favouriteSubject;
    }

    public String getFavouriteSubject(){
        return favouriteSubject;
    }


    @Override
    public String toString(){
        return super.toString() + " favourite subject= " + favouriteSubject;
    }

    @Override
    public String weekendPlan(){
        return " plans to tudy all day and party half the night.";
    }
}
