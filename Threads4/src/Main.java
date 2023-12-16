import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("abc", 7000);
        SavingsAccount account2 = new SavingsAccount("xyz", 10000);

        //each thread calls withdraw() 1000 times
        Thread t0 = new Thread(() -> IntStream.range(0, 1000).forEach((i) -> account1.withdraw(1)));  //$1000
        Thread t1 = new Thread(() -> IntStream.range(0, 1000).forEach((i) -> account1.withdraw(2)));  //$2000
        Thread t2 = new Thread(() -> IntStream.range(0, 1000).forEach((i) -> account2.withdraw(5)));  //$5000
        Thread t3 = new Thread(() -> IntStream.range(0, 1000).forEach((i) -> account2.withdraw(3)));  //$3000

        t0.start();
        t1.start();
        t2.start();
        t3.start();

        try {
            t0.join();
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(account1);  //balance should be 4000
        System.out.println(account2);  //balance should be 2000
    }
}