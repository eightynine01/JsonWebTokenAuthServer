package univth.com.jwt.user.domain;

import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;
import univth.com.jwt.user.JwtUserController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by TaeHwan
 * 2017. 12. 12. PM 2:44
 */
@Getter
public class JwtUserResource extends ResourceSupport{
    private final JwtUser jwtUser;

    public JwtUserResource(final JwtUser jwtUser) {
        this.jwtUser = jwtUser;
        final long id = jwtUser.getJwtId();
        add(linkTo(JwtUserController.class).withRel("user"));
//        add(linkTo(methodOn(GymMembershipController.class).all(id)).withRel("memberships"));
//        add(linkTo(methodOn(PersonController.class).get(id)).withSelfRel());
    }
}
