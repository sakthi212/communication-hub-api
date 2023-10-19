package com.hackathon.springboot.security;
/*
 * package com.mylearning.springboot.security;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.Customizer; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * import org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * @Configuration public class DemoSecurityConfig {
 * 
 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
 * Exception {
 * 
 * http.authorizeHttpRequests(configurer ->
 * configurer.requestMatchers(HttpMethod.GET, "/api/countries")
 * .hasRole("EMPLOYEE").requestMatchers(HttpMethod.GET,
 * "/api/countries/**").hasRole("EMPLOYEE") .requestMatchers(HttpMethod.POST,
 * "/api/countries").hasRole("MANAGER") .requestMatchers(HttpMethod.PUT,
 * "/api/countries").hasRole("MANAGER") .requestMatchers(HttpMethod.DELETE,
 * "/api/countries/**").hasRole("ADMIN") .requestMatchers(HttpMethod.GET,
 * "/api/cities").hasRole("EMPLOYEE") .requestMatchers(HttpMethod.GET,
 * "/api/cities/**").hasRole("EMPLOYEE") .requestMatchers(HttpMethod.POST,
 * "/api/cities").hasRole("MANAGER") .requestMatchers(HttpMethod.PUT,
 * "/api/cities").hasRole("MANAGER") .requestMatchers(HttpMethod.DELETE,
 * "/api/cities/**").hasRole("ADMIN") .requestMatchers(HttpMethod.GET,
 * "/api/employees").hasRole("EMPLOYEE") .requestMatchers(HttpMethod.GET,
 * "/api/employees/**").hasRole("EMPLOYEE") .requestMatchers(HttpMethod.POST,
 * "/api/employees").hasRole("MANAGER") .requestMatchers(HttpMethod.PUT,
 * "/api/employees/**").hasRole("MANAGER") .requestMatchers(HttpMethod.DELETE,
 * "/api/employees/**").hasRole("ADMIN"));
 * 
 * // use HTTP Basic authentication http.httpBasic(Customizer.withDefaults());
 * 
 * // disable Cross Site Request Forgery (CSRF) // in general, not required for
 * stateless REST APIs that use POST, PUT, DELETE // and/or PATCH http.csrf(csrf
 * -> csrf.disable());
 * 
 * return http.build(); }
 * 
 * @Bean public UserDetailsManager userDetailsManager(DataSource dataSource) {
 * JdbcUserDetailsManager jdbcUserDetailsManager = new
 * JdbcUserDetailsManager(dataSource);
 * 
 * jdbcUserDetailsManager.
 * setUsersByUsernameQuery("select username, password, enabled from myusers where username=?"
 * );
 * 
 * jdbcUserDetailsManager.
 * setAuthoritiesByUsernameQuery("select username, role from roles where username=?"
 * );
 * 
 * return jdbcUserDetailsManager; }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Bean public InMemoryUserDetailsManager userDetailsManager() {
 * 
 * UserDetails john =
 * User.builder().username("john").password("{noop}test123").roles("EMPLOYEE").
 * build();
 * 
 * UserDetails mary =
 * User.builder().username("mary").password("{noop}test123").roles("EMPLOYEE",
 * "MANAGER") .build();
 * 
 * UserDetails susan =
 * User.builder().username("susan").password("{noop}test123") .roles("EMPLOYEE",
 * "MANAGER", "ADMIN").build();
 * 
 * return new InMemoryUserDetailsManager(john, mary, susan); } }
 */