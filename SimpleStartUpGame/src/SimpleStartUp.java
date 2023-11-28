public class SimpleStartUp {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(int guess){
        String result = "Miss";

        for(int cell: locationCells){
            if(guess == cell){
                result = "Hit the startup!";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "Killed the startup";
        }

        System.out.println(result);
        return result;
    }
}
