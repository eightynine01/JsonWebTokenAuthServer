package univth.com.jwt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 2:32
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) {
    }
    @Override
    public void configure(HttpSecurity web) throws Exception {
        web
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers(
                        "/v2/api-docs",
                        "/configuration/ui/**",
                        "/swagger-resources/**",
                        "/configuration/security/**",
                        "/swagger-ui.html",
                        "/webjars/**")
                .permitAll();
    }
}