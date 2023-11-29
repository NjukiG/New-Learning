public class Surgeon extends Doctor {
    private int yearsOfExperience;

    public Surgeon(String name, String proffession, int yearsOfExperience) {
        super(name, proffession);
        this.yearsOfExperience = yearsOfExperience;
    }

    public String makeIncision(){
        return "Yikes. I didn't expect your guts to fall out! \n" +
                "Now where is that stapler?";
    }
    @Override
    public void treatPatient() {
        System.out.println("I inherited my procedures so I didn’t bother with medical school.\n" +
                "Relax, this won’t hurt a bit.\n" +
                "(now where did I put that\n" +
                "power saw...)");
        System.out.println(makeIncision());
    }

    @Override
    public String toString() {
        return super.toString() + ", Years of Experience: " + yearsOfExperience;

    }
}
