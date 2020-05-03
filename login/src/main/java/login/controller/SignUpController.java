package login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import login.dto.User;
import login.dto.SignUpRequestDto;
import login.service.LoginService;

@RestController
public class SignUpController {
	
	@Autowired
	private LoginService loginService;
	
	
	// 회원 가입
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public User SignIn (@RequestBody SignUpRequestDto signInDto) throws Exception  {
		if (signInDto != null) {
			
			return loginService.save(signInDto);
		}
		return null;
	}
	
	   
}
