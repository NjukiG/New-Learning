import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceries = new ArrayList<>();
        ArrayList<String> drinks = new ArrayList<>();
        ArrayList<String> cereals = new ArrayList<>();
        ArrayList<String> otherItems = new ArrayList<>();

        drinks.add("Alcohol");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Water");
        drinks.add("Soda");

        cereals.add("Unga");
        cereals.add("Rice");
        cereals.add("Beans");
        cereals.add("Minji");
        cereals.add("Ndengu");

        otherItems.add("Stima");
        otherItems.add("Rent");
        otherItems.add("Maji");
        otherItems.add("WIFI");
        otherItems.add("Gabbage");

        groceries.add(drinks);
        groceries.add(cereals);
        groceries.add(otherItems);

        for(ArrayList grocery : groceries){
            for(Object item : grocery){
                System.out.println(item);
            }
        }

    }
}