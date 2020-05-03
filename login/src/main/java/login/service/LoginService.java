package login.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.dto.SignUpRequestDto;
import login.dto.User;
import login.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	UserRepository userRepository;

	@Transactional
	public User save(SignUpRequestDto requestDto) throws Exception {
		return userRepository.save(requestDto.toEntity());
	}
	
}
