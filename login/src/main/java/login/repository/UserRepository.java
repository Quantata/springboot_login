package login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import login.dto.User;



public interface UserRepository extends JpaRepository<User, Long> { 

}
