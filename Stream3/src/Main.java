import java.util.Arrays;
import java.util.List;


public class Main {
    //map each string to its length, then print the mapped stream elements
    //stream --> map --> forEach
    public static void printStringLengths(List<String> stringList) {
        stringList.stream().map(item -> item.length()).forEach(System.out::println);

    }

    //map each integer to its absolute value, then print mapped stream elements
    //stream --> map --> forEach
    public static void printAbsolute(List<Integer> numberList) {
        numberList.stream().map(num -> Math.abs(num)).forEach(System.out::println);

    }

    //return the sum of the absolute values using map and reduce
    //stream --> map --> reduce
    public static int sumAbsolute(List<Integer> nums) {

        return nums.stream().map(num -> Math.abs(num)).reduce(0, (a,b) -> a + b);
//        return 0; //replace with your solution
    }

    public static void main(String[] args) {
//        printStringLengths(Arrays.asList("John", "Joe", "Al", "Kate" ));
//        printAbsolute(Arrays.asList(6,2,-7,-3));

        int sum = sumAbsolute(Arrays.asList(6,2,-7,-3));
        System.out.println(sum);  //18
    }
}