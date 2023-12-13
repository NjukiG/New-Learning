import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        names.offer("George");
        names.offer("Rose");
        names.offer("Keren");
        names.offer("Robert");
        names.offer("Njuki");

        names.poll();

        for(String name : names){
            System.out.println(name);
        }
    }
}