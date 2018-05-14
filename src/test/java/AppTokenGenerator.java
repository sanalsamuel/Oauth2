import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class AppTokenGenerator {
	
	public static void main(String[] args) {
		for(int i=0;i<2; i++){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			System.out.println("U = " + uuid);
			String pwd = UUID.randomUUID().toString().replaceAll("-", "");
			System.out.println("P = " + pwd);
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			System.out.println("hashed P = " + bCryptPasswordEncoder.encode(pwd));
		}
		
	}
}
