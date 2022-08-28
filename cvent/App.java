package cvent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
//        System.out.println( "Hello World!" );
        Class c = Reflection.class;
        
        String s = "";
        s+=c.getName();
//        s+=
        		Field f[]=c.getDeclaredFields();
//        		System.out.println(f[0]);
        		Arrays.asList(f).stream().forEach(System.out::println);
        		Field f2 = c.getDeclaredField("a");
        		f2.setAccessible(true);
//        		f2.
        		Constructor ccc = c.getDeclaredConstructor();
        	       ccc.setAccessible(true);
        	       Reflection rf = (Reflection) ccc.newInstance();
//        	       rf.show();
//        	       rf.show(1,2,2,2,2,3,4,5,3,4,5);
//        		System.out.println(f2.get(rf));
//        		c.getMethods();
//        c.getInterfaces();
//        c.getSuperclass();
//        c.getModifiers();
//        c.isArray();
//        c.isInterface();
//        c.isPrimitive();
       Constructor c1[] =  c.getDeclaredConstructors();
       
//       Arrays.asList(c1).stream().forEach(aa-> Arrays.asList(aa.getParameterTypes()).stream().forEach(df->System.out.println(df.getTypeName()+" "+df.getName())));
//        c.getPackage();
//        try {
////			c.newInstance();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        System.err.println(""+s);
    }
}
