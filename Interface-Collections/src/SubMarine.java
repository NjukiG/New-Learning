public class SubMarine implements Swimmable{

    private String type;

    public SubMarine(String type){
        this.type = type;
    }

    @Override

    public void swim(){
        System.out.printf("I am a %s, and I am a war machine", type);
    }
}
