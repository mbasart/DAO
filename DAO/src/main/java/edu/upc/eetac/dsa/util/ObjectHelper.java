package edu.upc.eetac.dsa.util;


import java.lang.reflect.Field;

public class ObjectHelper {
    public static String[] getFields(Object entity) {

        Class theClass = entity.getClass();

        Field[] fields = theClass.getDeclaredFields();

        String[] sFields = new String[fields.length];
        int i=0;

        for (Field f: fields) sFields[i++]=f.getName();

        return sFields;

    }


    public static void setter(Object object, String property, Object value) {
        // Method // invoke

        Class theClass = object.getClass();

        Method method = theClass.getMethod(property,String.class);
        Object ret = method.invoke(object, value);

    }

    public static Object getter(Object object, String property) {
        // Method // invoke

        Class theClass = object.getClass();
        object."get"+property()   // object.getName();  property = "name"

        sMethod = "getName";  //"get"+property.substring(0,1).toUpperCase()+property.substring(1);

        Method method = theClass.getMethod(sMethod, null)  ;

        //Method[] methodList = theClass.getMethods();

        Object ret = method.invoke(object, null);


        return ret;
    }
}
