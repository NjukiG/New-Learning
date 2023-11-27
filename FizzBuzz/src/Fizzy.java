import java.util.ArrayList;

public class Fizzy {
    public static void main(String[] args) {
        ArrayList<String> fizzy = new ArrayList<String>();
        for (int i = 1; i < 100; i++) {
//             System.out.println(i);
            if (i % 3 == 0) {
//                System.out.println("Fizz");
                fizzy.add("Fizz");
            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
                fizzy.add("Buzz");
            } else {
//                System.out.println(String.valueOf(i);
                fizzy.add(String.valueOf(i));
            }
        }
        System.out.println(fizzy);
    }
}
