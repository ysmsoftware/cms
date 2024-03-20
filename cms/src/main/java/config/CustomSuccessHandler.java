package config;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.cms.repository.UserRepository;

public class CustomSuccessHandler implements AuthenticationSuccessHandler {
	
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		String redirectUrl = null;

		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("ROLE_USER")) { 				
					redirectUrl = "/view-beneficiary-details-user";					
					break;					
			} else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN1" )) {  
					redirectUrl = "/mhdc-dashboard?registrationStatus=0";
					break;
			} else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN2")) {  
					redirectUrl = "/mhdc-dashboard?registrationStatus=2";
					break;
			}else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN3")) {  
				redirectUrl = "/super-admin-dashboard";
				break;
			}
		}
		if (redirectUrl == null) {
			throw new IllegalStateException();
		}
		new DefaultRedirectStrategy().sendRedirect(request, response, redirectUrl);		
	}

	

}
