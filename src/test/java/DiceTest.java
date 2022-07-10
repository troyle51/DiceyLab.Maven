import org.junit.Assert;
import org.junit.Test;


public class DiceTest {
@Test
public void testDice(){
    //given
    Dice dice = new Dice();
    boolean isTrue = false;

    //when
    dice.rollDice();
    if(dice.rollDice() == 1 || dice.rollDice() == 2 || dice.rollDice() == 3 || dice.rollDice() == 4 || dice.rollDice() == 5 || dice.rollDice() == 6){
        isTrue = true;
    }
    //then
    Assert.assertEquals(true, isTrue);
}

@Test
    public void testTossAndSum(){
    //given
    Dice dice = new Dice();
    int i = 7;

    //when
    dice.tossAndSum(2);

    //then
    Assert.assertEquals(i, dice.tossAndSum(2));
}
}