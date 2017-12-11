package univth.com.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import univth.com.jwt.user.service.JwtNationalCodeService;

@SpringBootApplication
public class JwtApplication implements CommandLineRunner{

	private final JwtNationalCodeService jwtNationalCodeService;

	@Autowired
	public JwtApplication(JwtNationalCodeService jwtNationalCodeService) {
		this.jwtNationalCodeService = jwtNationalCodeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jwtNationalCodeService.createNationalCode("cd");
		jwtNationalCodeService.createNationalCode("ef");
		jwtNationalCodeService.createNationalCode("rs");
		jwtNationalCodeService.createNationalCode("ef");
	}
}