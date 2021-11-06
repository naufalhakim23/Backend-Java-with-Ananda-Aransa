import org.junit.Assert;
import org.junit.Test;

public class MiniCalculatorTest {

    MiniCalculator miniCalculator = new MiniCalculator();

    @Test
    public void testIsSum() {
        Assert.assertTrue(miniCalculator.isSum(1,2,3));
        Assert.assertFalse(miniCalculator.isSum(1,2,4));
        Assert.assertEquals(true, miniCalculator.isSum(1,2,3));
        Assert.assertEquals(false, miniCalculator.isSum(1,2,4));
        Assert.assertEquals(false, miniCalculator.isSum(1,2,25));
    }
    @Test
    public void testIsMultiply() {
        Assert.assertTrue(miniCalculator.isMultiply(5,2,10));
        Assert.assertFalse(miniCalculator.isMultiply(1,2,4)); 
        Assert.assertEquals(true, miniCalculator.isMultiply(7,4,28));
        Assert.assertEquals(false, miniCalculator.isMultiply(100,2,5));
        Assert.assertEquals(false, miniCalculator.isMultiply(1,2,25));
    }
    @Test
    public void testIsFibonacci() {
        Assert.assertTrue(miniCalculator.isFibonacci(1,1,2));
        Assert.assertFalse(miniCalculator.isFibonacci(1,1,3));
        Assert.assertEquals(true, miniCalculator.isFibonacci(1,1,2));
        Assert.assertEquals(false, miniCalculator.isFibonacci(1,1,3));
        Assert.assertEquals(false, miniCalculator.isFibonacci(1,1,25));
    }
}
