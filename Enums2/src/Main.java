
enum Laptop {
    MacBook(2000), HP(1000), Acer(800);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(Laptop laptop : Laptop.values()){
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}