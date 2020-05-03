package login.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignUpRequestDto {
	
	private String email;
	private String password;
	private String name;
	private String nickname;
	

	@Builder
	public SignUpRequestDto(String email, String password, String name, String nickname) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
	}
	
	public User toEntity() {
		return User.builder().email(this.email).password(this.password)
				.name(this.name).nickname(this.nickname).build();
	}
	
	
}
