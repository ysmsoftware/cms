/*
 * package config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * 
 * import com.cms.entities.User; import com.cms.repository.UserRepository;
 * 
 * public class UserDetailsServiceImpl implements UserDetailsService {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String userName) throws
 * UsernameNotFoundException { User user =
 * userRepository.getUserByUserName(userName); System.out.println(user);
 * if(user==null) { throw new UsernameNotFoundException("Could not found user");
 * }
 * 
 * CustomUserDetails customerUserDetails = new CustomUserDetails(user);
 * 
 * return customerUserDetails; }
 * 
 * }
 */


