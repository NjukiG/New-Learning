public class InorderUppercaseFunction implements ConcatStringFunction{
    @Override
    public String apply(String[] strings){
        return String.join("", strings).toUpperCase();
    }
}
