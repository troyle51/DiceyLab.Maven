public class Dice {

    private int numOfDice;

    public Dice() {
        this.numOfDice = numOfDice;
    }

    public static int rollDice(){
        double roll = Math.random() * 6 +1;
        int toInt = (int) roll;
        return toInt;
    }

    public static int tossAndSum(Integer numOfDice){
        int sum = 0;
        for (int i = 0; i < numOfDice; i++){
            sum = sum + rollDice();
        }
        return sum;
    }
}
