import org.junit.Assert;
import org.junit.Test;

public class MiniCalculatorTest {

    MiniCalculator miniCalculator = new MiniCalculator();

    @Test
    public void testIsSum() {
        Assert.assertTrue(miniCalculator.isSum(1,2,3));
        Assert.assertFalse(miniCalculator.isSum(1,2,4));
        Assert.assertEquals(expeceted:true, miniCalculator.isSum(1,2,3));
    }
}
