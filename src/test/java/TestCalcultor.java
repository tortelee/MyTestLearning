import org.junit.Assert;


import com.fortest.*;
import org.testng.annotations.BeforeClass;

public class TestCalcultor {
    @BeforeClass
    public void before(){
        System.out.println("before class");
    }


    @org.testng.annotations.Test
    public void testAdd(){
        Assert.assertEquals(5,new Calcultor().add(2,3));
        System.out.println("finished!");
    }
}
