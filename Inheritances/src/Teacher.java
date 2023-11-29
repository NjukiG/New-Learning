public class Teacher extends Person {
    private String subjectTaught;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String subjectTaught) {
        super(name, age);
        this.subjectTaught = subjectTaught;
    }


    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    @Override
    public String weekendPlan() {
        return " plans to grade exams papers all day!";
    }

    @Override
    public String toString() {
        return super.toString() + " Subject taught= " + subjectTaught;
    }

}
