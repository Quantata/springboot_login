package login.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

// ref : https://yonguri.tistory.com/106?category=359079
// ref : https://wedul.site/562
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PasswordCheckValidator.class})
public @interface PasswordCheck {
	
}
