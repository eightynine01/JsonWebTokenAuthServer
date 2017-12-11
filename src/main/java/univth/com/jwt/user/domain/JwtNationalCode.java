package univth.com.jwt.user.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 10:28
 */
@Entity @NoArgsConstructor @Data
public class JwtNationalCode{
    @Id @GeneratedValue
    private Long jwtNationalCodeId;
    private String jwtNationalCode;
}