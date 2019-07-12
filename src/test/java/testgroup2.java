import org.testng.annotations.Test;

/**
 * group支持正则表达
 */
public class testgroup2 {
    @Test(groups={"windows.checkingtest"})
    public void testWindowOnly(){}

    @Test(groups={"linux.checkingtest"})
    public void testlinuxOnly(){}

    @Test(groups={"windows.functest"})
    public void testWindowToo(){}

}
