package login.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignInRequestDto {
	private Long id;
	private String email;
	private String password;
	private String name;
	private String nickname;
	

	@Builder
	public SignInRequestDto(Long id, String email, String password, String name, String nickname) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
	}
	
	public SignIn toEntity() {
		return SignIn.builder().id(this.id).email(this.email).password(this.password)
				.name(this.name).nickname(this.nickname).build();
	}
	
	
}
