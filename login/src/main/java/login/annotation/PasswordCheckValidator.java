package login.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class PasswordCheckValidator implements ConstraintValidator<PasswordCheck, String> {

	@Override
	  public boolean isValid(String value, ConstraintValidatorContext context) {
	    // 6�ڸ��̻� �빮�� ����
		return true;
	  }

}
