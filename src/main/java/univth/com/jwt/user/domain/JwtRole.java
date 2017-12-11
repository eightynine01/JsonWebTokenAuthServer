package univth.com.jwt.user.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 7:53
 */
@Entity @NoArgsConstructor @Data
public class JwtRole {
    @Id @GeneratedValue
    private Long jwtRoleId;
    private String jwtRoleName;
}
