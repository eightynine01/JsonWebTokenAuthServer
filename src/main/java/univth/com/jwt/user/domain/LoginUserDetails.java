package univth.com.jwt.user.domain;

import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import static org.springframework.security.core.authority.AuthorityUtils.NO_AUTHORITIES;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 7:21
 */
public class LoginUserDetails extends User{
    private static final long serialVersionUID = 1L;
    @Getter
    private Long id;
    public LoginUserDetails(JwtUser jwtUser) {
        super(
                jwtUser.getJwtUsername(),
                jwtUser.getJwtPassword(),
                NO_AUTHORITIES
        );
        id = jwtUser.getJwtId();
    }
}
