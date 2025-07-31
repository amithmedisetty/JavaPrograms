package CustomAnotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat c=new Cat("lilly");
        Class<?> clazz=c.getClass();
        if(clazz.isAnnotationPresent(AnimalAnotation.class)){
            System.out.println("cat comes under animal");
        }else{
            System.out.println("cat do not comes under animal");
        }
        Method[] m=clazz.getDeclaredMethods();
        for(Method i:m){
            if(i.isAnnotationPresent(MethodAnotation.class)){
                MethodAnotation a=i.getAnnotation(MethodAnotation.class);
                for(int k=0;k<a.count();k++){
                    try{
                       i.invoke(c);
                    }catch(Exception e){
                       System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}
