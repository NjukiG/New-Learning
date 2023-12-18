
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static MyInterface nextInt = (num) -> {
        return num + 1;
    } ; //replace null with lambda expression

    public static MyIntPredicate isEven = (num) -> {
        return num % 2 == 0;
    }; //replace null with lambda expression


    public static MyIntOperator nextOdd = (num) -> {
        if(num % 2 == 0){
            return num + 1;
        }else{
            return num + 2;
        }
    }; //replace null with lambda expression



    public static void main(String[] args) {
        System.out.println(nextInt.apply(6)); //7
        System.out.println(nextInt.apply(13)); //14
        System.out.println(nextInt.apply(-5)); //-4
        System.out.println(nextInt.apply(0)); //1


        System.out.println(isEven.test(6)); //true
        System.out.println(isEven.test(13)); //false
        System.out.println(isEven.test(-5)); //false
        System.out.println(isEven.test(0)); //true

        System.out.println(nextOdd.apply(6)); //7
        System.out.println(nextOdd.apply(13)); //15
        System.out.println(nextOdd.apply(-5)); //-3
        System.out.println(nextOdd.apply(0)); //1
    }
}