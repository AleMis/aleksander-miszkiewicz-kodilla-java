package reflection;

import java.lang.reflect.Field;

public class MainReflection {

    public static void main(String args[]) {

        Class myClass = MyObject.class;
        Field[] myClassFields = myClass.getFields();
        for(int i = 0; i<myClassFields.length; i++) {
            System.out.println(myClassFields[i]);
            System.out.println(myClassFields[i].getType());
        }
    }
}
