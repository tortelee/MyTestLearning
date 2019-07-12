import org.testng.annotations.Test;

public class testGroup {
    @Test(groups={"functest", "checkintest"})
    public void testMethod1(){
        System.out.println("method1");
    }
    @Test(groups={"functest", "checkintest"})
    public void testMethod2(){
        System.out.println("method2");
    }
    @Test(groups={"functest"})
    public void testMethod3(){
        System.out.println("method3");
    }
}
