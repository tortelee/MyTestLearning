import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**测试数据存放的位置：
 * 代码：
 *    硬编码在java源代码上
 *    配置的properties上
 *
 * 本地：
 *    txt文本文件上
 *    excel文本
 *    数据库
 * 网络
 */
public class testDataProvider {
    @DataProvider(name="dataP")
    public Object[][] dataprovider(){
        return new Object[][]{
                {"s"},
                {"df"},
                {"we"},
                {"ee"}
        };
    }

    @Test(dataProvider = "dataP")
    public void test(String name){
        System.out.println(name+"huli");
    }
}
/**
 * If you want to put your data provider in a different class,
 * it needs to be a static method or a class with a non-arg constructor,
 * and you specify the class where it can be found in the dataProviderClass attribute:
 * 在别的类设置dataprovider类时，必须是静态的方法或者类
 */
