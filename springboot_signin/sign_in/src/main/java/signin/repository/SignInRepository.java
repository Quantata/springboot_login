package signin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import signin.dto.SignIn;



public interface SignInRepository extends JpaRepository<SignIn, Long> { 

}
