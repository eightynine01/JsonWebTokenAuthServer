package univth.com.jwt.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univth.com.jwt.user.domain.JwtNationalCode;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 10:32
 */
@Repository
public interface JwtNationalCodeRepository extends JpaRepository<JwtNationalCode, Long>{
    JwtNationalCode findByJwtNationalCode(String nc);
}