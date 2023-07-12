package javacode;
import org.junit.*;
import javacode.Solution.*;

public class SolutionsTest {

    @Test
    public void testCase1() {
        String s = "leet**cod*e";

        Solution sol = new Solution();
        String result = sol.removeString(s);
        String exepected = "lecoe";

        Assert.assertEquals(result,exepected);
    }

    @Test
    public void testCase2() {
        String s = "erase*****";

        Solution sol = new Solution();
        String result = sol.removeString(s);
        String exepected = "";

        Assert.assertEquals(result,exepected);
    }
    
}
