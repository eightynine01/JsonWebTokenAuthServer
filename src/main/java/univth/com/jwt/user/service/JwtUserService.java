package univth.com.jwt.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import univth.com.jwt.user.domain.JwtUser;
import univth.com.jwt.user.repository.JwtUserRepository;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 6:37
 */
@Service @Slf4j
public class JwtUserService {

    private final JwtUserRepository jwtUserRepository;

    @Autowired
    public JwtUserService(JwtUserRepository jwtUserRepository) {
        this.jwtUserRepository = jwtUserRepository;
    }

    public JwtUser getJwtUser(String username){
        log.info(username);
        JwtUser jwtUser = jwtUserRepository.findByJwtUsername(username);
        log.info("jwtUser : {}", jwtUser.toString());
        return jwtUser;
    }

    @Transactional
    public boolean createUser(JwtUser jwtUser){

        return true;
    }
}