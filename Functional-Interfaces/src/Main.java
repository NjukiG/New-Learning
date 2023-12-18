public class Main {
    public static void main(String[] args) {
        String[] fruits = {"banana", "Grape", "SMOOTHIE"};
        ConcatStringFunction function;

        function = new InorderUppercaseFunction();
        System.out.println(function.apply(fruits)); //BANANAGRAPESMOOTHIE

        function = new ReverseLowercaseFunction();
        System.out.println(function.apply(fruits)); //smoothiegrapebanana
    }
}