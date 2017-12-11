package univth.com.jwt.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univth.com.jwt.user.domain.JwtUser;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 6:36
 */
@Repository
public interface JwtUserRepository extends JpaRepository<JwtUser, Long>{
    JwtUser findByJwtUsername(String username);
}
