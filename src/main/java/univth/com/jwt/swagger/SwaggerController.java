package univth.com.jwt.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by TaeHwan
 * 2017. 12. 11. PM 3:28
 */
@Controller
public class SwaggerController {
    @GetMapping("/swag")
    public String swaggerUi(){
        return "redirect:swagger-ui.html";
    }
}
