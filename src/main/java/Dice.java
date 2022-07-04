public class Dice {

    private int numOfRolls;

    public Dice() {
        this.numOfRolls = numOfRolls;
    }

    public int rollDice(){
        double roll = Math.random() * 6 +1;
        int toInt = (int) roll;
        return toInt;
    }

    public int rollMultipleDice(Integer numOfRolls){
        int sum = 0;
        for (int i = 0; i < numOfRolls; i++){
            sum = sum + rollDice();
        }
        return sum;
    }
}
