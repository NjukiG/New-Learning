public class Mattress implements  Flippable{
    private boolean labelSideUp = true;

    @Override

    public void flip(){
        System.out.println("Label side up is " + labelSideUp);
        labelSideUp = !labelSideUp;
    }

}
