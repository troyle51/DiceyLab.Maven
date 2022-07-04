public class Dice {

    private int numOfRolls;

    public Dice() {
        this.numOfRolls = numOfRolls;
    }

    public int rollDice(){
        double roll = Math.random() * 6 +1;
        int toInt = (int) roll;
        //roll = roll * numOfRolls;
        //System.out.println(toInt);
        return toInt;
    }
}
