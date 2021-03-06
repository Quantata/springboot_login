package login.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	@Email(message = "validation email")
	private String email;
	
	@Column(length = 50, nullable = false)
	private String password;

	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 20, nullable = false)
	private String nickname;

	@Builder
	public User(Long id, String email, String password, String name, String nickname) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
	}
	
	
	
}
