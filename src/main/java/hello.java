import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Calendar;


public class hello {
    public String myname;
    public hello(String myname){
        this.myname=myname;

    }

    /**
     * 创建对象方法，设定传如的参数，读取参数（xml外部配置），真实创建
     * @param args
     * @throws ParseException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */

    public static void main(String[] args) throws ParseException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c =hello.class;
        Constructor<?> constructor = c.getConstructor(String.class);
        hello h = (hello)constructor.newInstance("  tom");
        Method method = c.getMethod("say",String.class);
        String ss = method.getName();

        method.invoke(h,"i am hungry");


    }
    public void say(String s){
        System.out.println("my name is "+myname+"\n"+"today,"+s);
    }



}
