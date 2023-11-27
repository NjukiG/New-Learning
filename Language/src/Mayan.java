public class Mayan extends Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Mayan(String languageName, int speakers) {
        super(languageName, speakers, "Central America", "verb-object-subject");
        this.name = languageName;
        this.numSpeakers = speakers;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in Central America.");
        System.out.println("The language follows the word order verb-object-subject.");
        System.out.println("Funfact: " + this.name + " is an ergative language.");
    }
}
