//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.println("Today's daily specials:");

        printSpecial("One Scoop", 3.75);
        printSpecial("Two Scoops", 5.25);
        printSpecial("Three Scoops", 6.75);
        printSpecial("Ice Cream Sandwiches", 6.50);
        printSpecial("Milkshakes", 6.95);
        printSpecial("Small Sundae", 6.99);
        printSpecial("Large Sundae", 7.99);
        printSpecial("Pint", 8.00);


        System.out.println();
        System.out.println("Today's ice cream flavors are:\n");
        printFlavours("Vanilla", "Chocolate");
        printFlavours("Strawberry","Cookies and Cream");
        printFlavours("Cookie Dough", "Birthday Cake");
        printFlavours("Mint Chocolate Chip", "");

        System.out.println();
        System.out.println("Today's ice cream toppings are:");
        printTopping("Chocolate Chips");
        printTopping("Rainbow Sprinkles");
        printTopping("Cherries");
        printTopping("Strawberries");
        printTopping("Bananas");
        printTopping("Caramel Sauce");
        printTopping("Chocolate Syrup");

    }

    public static void printSpecial(String item, double price){
        System.out.printf("%-20s ... $%.2f%n", item, price);
    }

    public static void printFlavours(String flavour1, String flavour2){
        System.out.printf("%-2s  %2s",flavour1, flavour2);
    }

    private static void printTopping(String topping) {
        System.out.printf("%-20s", topping);
        if (topping.equals("Chocolate Syrup")) {
            System.out.println();
        }
    }
}