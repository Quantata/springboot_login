package login.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class PasswordCheckValidator implements ConstraintValidator<PasswordCheck, String> {

	@Override
	  public boolean isValid(String value, ConstraintValidatorContext context) {
	    // 6자리이상 대문자 포함
		return true;
	  }

}
