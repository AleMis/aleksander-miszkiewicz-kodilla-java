package reflection;

import java.lang.reflect.Field;

public class MainReflection {

    public static void main(String args[]) {

        Class myClass = MyObject.class;
        reflection(myClass);

    }


    public static void reflection(Class myclass) {
        Field[] fields = myclass.getFields();
        for(int i = 0; i<fields.length; i++) {
            System.out.println("Field = " + fields[i]);
            System.out.println("Field type = " + fields[i].getType());
        }
    }
}
