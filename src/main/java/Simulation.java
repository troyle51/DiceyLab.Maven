import java.util.Arrays;

public class Simulation {

    public static void main(String[] args){
        //Dice dice = new Dice();
        Bins bins = new Bins();
        bins.createBin();
        numOfRolls(1000000, bins);

    }

    private static Bins numOfRolls(int numOfRolls, Bins bins) {
//        Bins bin = new Bins();
        for(int i = 0; i < numOfRolls; i++){
            int results = Dice.tossAndSum(2);
            bins.incrementBin(results);
        }
        Integer[] newArray = bins.getBinsArr();
        printBins(newArray);
        return bins;
    }

    private static void printBins(Integer[] newArray) {
        //System.out.println(newArray[0]);
        //System.out.println(bins.getBinsArr()[0]);
        for(int i = 0 ; i < newArray.length; i++) {
            Double percentage = Double.valueOf(newArray[i] / 1000000.0);
            String output = String.format("%.2f",percentage);
            System.out.println(newArray[i]+ ": "+ output);
        }
    }


}
