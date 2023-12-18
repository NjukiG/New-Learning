
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String PREFIX = "__prefix__";
    private static final String SUFFIX = "__suffix__";

    // fix the scope error and remove whitespace from str
    public static StringOperator operator = str -> PREFIX + str.trim() + SUFFIX;

    public static void main(String[] args) {
        String res = operator.apply("  hello there  ");
        System.out.println(res); // __prefix__hello there__suffix__
    }
}