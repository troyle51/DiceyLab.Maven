import org.junit.Assert;
import org.junit.Test;


public class DiceTest {
@Test
public void testDice(){
    //given
    Dice dice = new Dice();
    int roll = 1;
    //when
    dice.rollDice(2);
    //then
    Assert.assertEquals(roll, dice.rollDice(2));
}
}