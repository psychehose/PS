namespace csharpcodeTests;
using csharpcode;
using Xunit;

public class SolutionTests {
    [Fact]
    public void TestCase1() {
        
        Solution sol = new Solution();
        string s = "leet**cod*e";

        string result = sol.RemoveStars(s);
        string exepected = "lecoe";

        Assert.Equal(result, exepected);

        return;
    }

    [Fact]
    public void TestCase2() {
        
        Solution sol = new Solution();
        string s = "erase*****";

        string result = sol.RemoveStars(s);
        string exepected = "";

        Assert.Equal(result, exepected);

        return;
    }
}