package login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import login.dto.SignIn;



public interface SignInRepository extends JpaRepository<SignIn, Long> { 

}
