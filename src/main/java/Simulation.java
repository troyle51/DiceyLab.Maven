import java.util.Arrays;

public class Simulation {

    public static void main(String[] args){
        //Dice dice = new Dice();
        Bins bins = new Bins();
        bins.createBin();
        numOfRolls(100, bins);

    }

    private static Bins numOfRolls(int numOfRolls, Bins bins) {
//        Bins bin = new Bins();
        for(int i = 0; i < numOfRolls; i++){
            int results = Dice.tossAndSum(2);
            bins.incrementBin(results);
        }
        return bins;
    }


}
