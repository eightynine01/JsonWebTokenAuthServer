package univth.com.jwt.user.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 6:38
 */
@Entity @NoArgsConstructor @Data
public class JwtUser{
    @Id @GeneratedValue
    private Long jwtId;
    private String jwtUsername;
    private String jwtPassword;
    @OneToOne
    private JwtNationalCode jwtNationalCode;
    @OneToMany
    private List<JwtRole> jwtRoles;
}
