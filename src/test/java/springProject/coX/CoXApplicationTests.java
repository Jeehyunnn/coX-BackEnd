package springProject.coX;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springProject.coX.repository.UserRepository;
import springProject.coX.vo.User;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class CoXApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	@DisplayName("정상 회원 가입 케이스 테스트")
	void joinUser() {
		// given
		User insertUser = userRepository.save(User.builder()
				.username("jeehyun") // username 필드 사용
				.password("password") // password 필드 사용
				.email("aaa@aaa.com") // email 필드 사용
				.role("USER") // role 필드 사용
				.build());

		// when
		User saveUser = userRepository.findById(insertUser.getUserId()).get(); // userId로 조회

		// then
		assertThat(insertUser).isEqualTo(saveUser);
	}


}
