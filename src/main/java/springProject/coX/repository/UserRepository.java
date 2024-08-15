package springProject.coX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springProject.coX.vo.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//        User findByEmail(String email); // email로 사용자 찾기

        Optional<User> findByEmail(String email);
        Optional<User> findByUsername(String username);

}
