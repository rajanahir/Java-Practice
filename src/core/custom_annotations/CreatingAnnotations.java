package core.custom_annotations;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class CreatingAnnotations {
    /*
    * Annotations are kind of metadata they're supplimental that you can put into your java code.
    * Eexample: @SuppressWarnings()
    */

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        @SuppressWarnings({"unused","redundant"})
        String str = new String("ABC");

        Cat myCat = new Cat("Stella");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important! :)");
        } else {
            System.out.println("This thing is not very important! :(");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if ( method.isAnnotationPresent(RunImmediately.class) ) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i =0; i < annotation.time(); i++)
                    method.invoke(myCat);
            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objValue = field.get(myCat);
                //it will automatically cast to string and put it in strValue
                if (objValue instanceof  String strValue)
                    System.out.println(strValue.toUpperCase());
            }
        }

    }

}
