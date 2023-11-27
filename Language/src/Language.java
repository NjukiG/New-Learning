public class Language{


    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;


    public Language(String languageName, int speakers, String regionsSpoken, String wordOrder){
        this.name = languageName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args){
        Language swahili = new Language("Swahili", 200, "Kenya, Tanzania, Uganda, Congo", "subject-verb-object");
        swahili.getInfo();

        Mayan kiche = new Mayan("Ki'che'", 300);
        kiche.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();

    }
}