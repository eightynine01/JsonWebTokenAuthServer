package univth.com.jwt.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import univth.com.jwt.user.domain.JwtNationalCode;
import univth.com.jwt.user.repository.JwtNationalCodeRepository;

import java.util.Optional;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 10:33
 */
@Service @Slf4j
public class JwtNationalCodeService {

    private final JwtNationalCodeRepository jwtNationalCodeRepository;

    @Autowired
    public JwtNationalCodeService(JwtNationalCodeRepository jwtNationalCodeRepository) {
        this.jwtNationalCodeRepository = jwtNationalCodeRepository;
    }

    @Transactional
    public boolean createNationalCode(String nationalCode){
        log.info(nationalCode);
//        Optional<JwtNationalCode> jaa = Optional.ofNullable(jwtNationalCodeRepository.findByJwtNationalCode(nationalCode)).ifPresent(
//                o->{
//                    JwtNationalCode jwtNationalCode = new JwtNationalCode();
//                    jwtNationalCode.setJwtNationalCode(nationalCode);
//                    jwtNationalCodeRepository.save(jwtNationalCode);
//                });
//        log.info("jaa : {}", jaa);
        JwtNationalCode jwtNationalCode = new JwtNationalCode();
        jwtNationalCode.setJwtNationalCode(nationalCode);
        jwtNationalCodeRepository.save(jwtNationalCode);
        return true;
    }
}
