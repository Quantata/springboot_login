package login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import login.dto.SignIn;
import login.dto.SignInRequestDto;
import login.service.SignInService;

@RestController
public class SignInController {
	
	@Autowired
	private SignInService signInService;
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public SignIn SignIn (@RequestBody SignInRequestDto signInDto) throws Exception  {
		if (signInDto != null) {
			
			return signInService.save(signInDto);
		}
		return null;
	}
	
	   
}
