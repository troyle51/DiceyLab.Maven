public class Simulation {

    public static void main(String[] args){
        Dice dice = new Dice();
        Bins bin = new Bins();
        bin.createBin();

        numOfRolls(10);
    }

    private static void numOfRolls(int numOfRolls) {
        Bins bin = new Bins();
        for(int i = 0; i < numOfRolls; i++){
            int results = Dice.tossAndSum(2);
            System.out.println(results);
            //bin.incrementBin(results); //Not properly incrementing the bins
        }
    }


}
