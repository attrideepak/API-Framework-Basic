package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, TYPE})
public @interface Retriable {
    // Specify how many times you want to
    // retry the test if failed.
    // Default value of retry count is 0
    int attempts() default 1;
}
