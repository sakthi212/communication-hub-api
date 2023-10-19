package com.hackathon.springboot.security;
/*
 * package com.mylearning.springboot.security;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.authentication.AuthenticationProvider; import
 * org.springframework.security.authentication.BadCredentialsException; import
 * org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.security.core.Authentication; import
 * org.springframework.security.core.AuthenticationException; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.stereotype.Component;
 * 
 * import com.mylearning.springboot.cruddemo.entity.MyUsers; import
 * com.mylearning.springboot.cruddemo.entity.Roles; import
 * com.mylearning.springboot.repository.RoleRepository; import
 * com.mylearning.springboot.repository.UserRepository;
 * 
 * @Component public class CustomAuthenticationProvider implements
 * AuthenticationProvider {
 * 
 * @Autowired private UserRepository userRepositry;
 * 
 * @Autowired private RoleRepository roleRepository;
 * 
 * @Autowired private PasswordEncoder passwordEncoder;
 * 
 * @Override public Authentication authenticate(Authentication authentication)
 * throws AuthenticationException { // TODO Auto-generated method stub String
 * userName = authentication.getName(); String pwd =
 * authentication.getCredentials().toString(); MyUsers users =
 * userRepositry.findById(userName).get(); if (null != users) { if
 * (passwordEncoder.matches(pwd, users.getPassword())) { List<GrantedAuthority>
 * authorities = new ArrayList<>(); List<Roles> roles = users.getRoles();
 * roles.forEach(role -> authorities.add(new
 * SimpleGrantedAuthority(role.getRole()))); return new
 * UsernamePasswordAuthenticationToken(userName, pwd, authorities); } else {
 * throw new BadCredentialsException("Invalid Password"); } } else { throw new
 * BadCredentialsException("User not found"); } }
 * 
 * @Override public boolean supports(Class<?> authentication) { return
 * (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
 * }
 * 
 * }
 */