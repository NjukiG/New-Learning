public class SinoTibetan extends Language{

    public SinoTibetan(String languageName, int speakers){
        super(languageName, speakers, "Asia", "subject-object-verb");
        this.name = languageName;
        this.numSpeakers = speakers;
        if(languageName.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }

}
