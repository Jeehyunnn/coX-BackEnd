package springProject.coX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springProject.coX.dto.UserDTO;
import springProject.coX.repository.UserRepository;
import springProject.coX.vo.User;

import java.util.Optional;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public User registerUser(UserDTO userDTO) {
        if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }

        if (userRepository.findByUsername(userDTO.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }

        User user = User.builder()
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .password(userDTO.getPassword())
                .role("USER") // 기본 역할 설정
                .build();

        return userRepository.save(user);
    }

    public boolean authenticate(UserDTO userDTO) {
        Optional<User> userOpt = userRepository.findByEmail(userDTO.getEmail());
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            // 단순하게 비밀번호 비교, 실제로는 암호화된 비밀번호 비교 필요
            if (user.getPassword().equals(userDTO.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
