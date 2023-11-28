// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BottleSong {
    public static void main(String[] args) {

        int bottlesNum = 10;
        String word = "bottles";

        while(bottlesNum > 0){


            System.out.println(bottlesNum + " Tusker " + word + " hanging on the wall.") ;
            System.out.println(bottlesNum + " Tusker " + word + " hanging on the wall.") ;
            System.out.println("And if one Tusker bottle should accidentally fall!");
            bottlesNum -= 1;

            if(bottlesNum == 1) word = "bottle";

            if(bottlesNum > 0){
                System.out.println("There'll be " + bottlesNum + " Tusker " + word + " hanging on the wall.");
            }else{
                System.out.println("There'll be no more tusker bottles hanging on the wall.");
            }

        }



    }
}
