package springProject.coX;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.sql.DataSource;
import java.sql.Connection;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DBConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void testConnection() {
        try (Connection con = ds.getConnection()) {
            System.out.println("MariaDB 연결 성공 : " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
