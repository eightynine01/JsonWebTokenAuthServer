package univth.com.jwt.user.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 7:53
 */
@Entity @NoArgsConstructor @Data
public class JwtRole implements GrantedAuthority {
    @Id @GeneratedValue
    private Long jwtRoleId;
    private String jwtRoleName;

    @Override
    public String getAuthority() {
        return jwtRoleName;
    }
}
