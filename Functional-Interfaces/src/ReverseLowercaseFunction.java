import java.util.Arrays;
import java.util.Collections;

public class ReverseLowercaseFunction implements ConcatStringFunction{

    public String apply(String[] strings){
        Collections.reverse(Arrays.asList(strings));
        return String.join("", strings).toLowerCase();
    }
}
