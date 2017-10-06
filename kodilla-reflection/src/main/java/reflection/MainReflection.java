package reflection;

import reflection.exercise1.MyObject;
import reflection.exercise2.MyPair;

import java.lang.reflect.Field;

public class MainReflection {

    public static void main(String args[]) {

        //Exercise 1
        Class myClass = MyObject.class;
        reflection(myClass);

        //Exercise 2
        String x = "The population of poland is : ";
        Integer y = 36000000;
        MyPair<String, Integer> newPair = new MyPair<>(x, y);
        System.out.println(newPair.getX() + newPair.getY());
    }


    //Exercise 1
    public static void reflection(Class myclass) {
        Field[] fields = myclass.getFields();
        for(int i = 0; i<fields.length; i++) {
            System.out.println("Field = " + fields[i]);
            System.out.println("Field type = " + fields[i].getType());
        }
    }
}
