package signin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import signin.dto.SignIn;
import signin.dto.SignInRequestDto;
import signin.repository.SignInRepository;

@Service
public class SignInService {
	
	@Autowired
	SignInRepository signInRepository;

	@Transactional
	public SignIn save(SignInRequestDto requestDto) throws Exception {
		return signInRepository.save(requestDto.toEntity());
	}
	
}
