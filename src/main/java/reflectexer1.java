import java.lang.reflect.Array;

public class reflectexer1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName("java.lang.String");
        Object array = Array.newInstance(c,25);
        Array.set(array,0,"hello1");
        Array.set(array,1,"hello2");
        Array.set(array,2,"hello3");
        Array.set(array,3,"hello4");
        System.out.println(Array.get(array,3));
    }
}
