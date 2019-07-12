import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testParameter {
    @Test
    @Parameters({"hello"})
    public void Say(String s){
        System.out.println(s);
    }

}
