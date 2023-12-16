
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " start");

        Thread printTask1 = new Thread(new RangePrinter(5, 10));
        Thread printTask2 = new Thread(new RangePrinter(14, 16));

//        printTask1.run();
//        printTask2.run();
        printTask1.start();
        printTask2.start();

        System.out.println(Thread.currentThread().getName() + " finished");
    }
}