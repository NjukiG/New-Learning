import java.util.ArrayList;

public class SimpleStartUp {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "Miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Hit the startup!";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Killed the startup";
        }

        System.out.println(result);
        return result;
    }
}

//    ArrayList<String> locationCells;
//
//    public void setLocationCells(ArrayList<String> locs) {
//        locationCells = locs;
//    }
//
//    public String checkYouself(String userInput) {
//        String result = "Miss";
//
//        int index = locationCells.indexOf(userInput);
//
//        if (index >= 0) {
//            locationCells.remove(index);
//
//            if (locationCells.isEmpty()) {
//                result = "Killed the startup";
//            } else {
//                result = "Hit the startup!";
//            }
//        }
//
//        System.out.println(result);
//        return result;
//    }
