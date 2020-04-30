package login.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.dto.SignIn;
import login.dto.SignInRequestDto;
import login.repository.SignInRepository;

@Service
public class SignInService {
	
	@Autowired
	SignInRepository signInRepository;

	@Transactional
	public SignIn save(SignInRequestDto requestDto) throws Exception {
		return signInRepository.save(requestDto.toEntity());
	}
	
}
