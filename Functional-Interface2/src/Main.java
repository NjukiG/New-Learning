import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Replace MyInterface1 with an equivalent interface from java.util.function
//        MyInterface1 startsWithDigit = s -> !s.isEmpty() && Character.isDigit(s.charAt(0));
        Predicate<String> startsWithDigit= s -> !s.isEmpty() && Character.isDigit(s.charAt(0));
        System.out.println(startsWithDigit.test("9abc"));  //true
        System.out.println(startsWithDigit.test("hello")); //false
        System.out.println(startsWithDigit.test("")); //false




        //Replace MyInterface2 with an equivalent interface from java.util.function
//        MyInterface2 exclaim = i -> "!".repeat(i);
        IntFunction<String> exclaim = i -> "!".repeat(i);
        System.out.println(exclaim.apply(4)); //!!!!


        //Replace MyInterface3 with an equivalent interface from java.util.function
//        MyInterface3 question = s -> System.out.println(s+"?");
        Consumer<String> question = (s)-> System.out.println(s + "?");
        question.accept("huh"); //huh?


//         ?????  hypotenuse = (a, b) -> java.lang.Math.sqrt(a*a + b*b);
//        System.out.println(hypotenuse.?????(3.5, 4.2));

        DoubleBinaryOperator hypotenuse = (a, b) -> Math.sqrt(a * a + b * b);
        System.out.println(hypotenuse.applyAsDouble(3.5, 4.2));
    }
}