import org.testng.Assert;
import org.testng.annotations.Test;

public class testbook {
    @Test
    public void testbook(){
        book b = new book();
        b.setName("history");
        b.setPageNum(302);
        Assert.assertEquals("history",b.getName());
        Assert.assertEquals(302,b.getPageNum());
        book b1 = new book();
        b1.setName("history1");
        b1.setPageNum(180);
        Assert.assertEquals(200,b1.getPageNum());
    }
}
