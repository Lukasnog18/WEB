//package com.ufc.br.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import com.ufc.br.security.UserDetailsServiceImplements;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private UserDetailsServiceImplements userDetailsServiceImple;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.csrf().disable().authorizeRequests()
//		.antMatchers("/inicio").permitAll()
//		.antMatchers("/produtos/armas").permitAll()
//		.antMatchers("/pessoa/salvar").permitAll()
//		.antMatchers("/pessoa/formcadastro").permitAll()
//		.anyRequest().authenticated()
//		.and().formLogin().loginPage("/pessoa/logar").permitAll()
//		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.userDetailsService(userDetailsServiceImple).passwordEncoder(new BCryptPasswordEncoder());
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception{
//		web.ignoring().antMatchers("/css/**", "/js/**");
//	}
//}
