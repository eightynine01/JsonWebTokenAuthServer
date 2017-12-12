package univth.com.jwt.user.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 6:38
 */
@Entity @NoArgsConstructor @Data
public class JwtUser implements UserDetails {
    @Id @GeneratedValue
    private Long jwtId;
    private String jwtUsername;
    private String jwtPassword;
    private Boolean jwtExpire;
    private Boolean jwtLock;
    private Boolean jwtCredentialsExpire;
    private Boolean jwtEnable;
    @OneToOne
    private JwtNationalCode jwtNationalCode;
    @OneToMany
    private List<JwtRole> jwtRoles;

    @Override
    public Collection<JwtRole> getAuthorities() {
        return jwtRoles;
    }

    @Override
    public String getPassword() {
        return jwtPassword;
    }

    @Override
    public String getUsername() {
        return jwtUsername;
    }

    @Override
    public boolean isAccountNonExpired() {
        return jwtExpire;
    }

    @Override
    public boolean isAccountNonLocked() {
        return jwtLock;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return jwtCredentialsExpire;
    }

    @Override
    public boolean isEnabled() {
        return jwtEnable;
    }
}
