package univth.com.jwt.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import univth.com.jwt.user.domain.JwtUser;
import univth.com.jwt.user.domain.LoginUserDetails;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 8:06
 */
@Service
public class LoginUserDetailsService implements UserDetailsService {
    private final JwtUserService jwtUserService;

    @Autowired
    public LoginUserDetailsService(JwtUserService jwtUserService) {
        this.jwtUserService = jwtUserService;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        JwtUser jwtUser = jwtUserService.getJwtUser(username);

        if (jwtUser == null) throw new UsernameNotFoundException("login fail");

        return new LoginUserDetails(jwtUser);
    }

}
