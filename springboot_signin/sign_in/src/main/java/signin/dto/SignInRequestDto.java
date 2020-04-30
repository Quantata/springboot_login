package signin.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignInRequestDto {
	
	private String email;
	private String password;
	private String name;
	private String nickname;
	

	@Builder
	public SignInRequestDto(String email, String password, String name, String nickname) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
	}
	
	public SignIn toEntity() {
		return SignIn.builder().email(this.email).password(this.password)
				.name(this.name).nickname(this.nickname).build();
	}
	
	
}
