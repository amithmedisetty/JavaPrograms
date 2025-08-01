package CustomAnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  //on which anotations is applicable on class or method or anything
@Retention(RetentionPolicy.RUNTIME)  //how long the anotation should be retained(how long should it be available)(SOURCE, CLASS, RUNTIME)
public @interface AnimalAnotation {
}
