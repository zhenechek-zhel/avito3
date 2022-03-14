package com.amr.project.webapp.config.security;

import com.amr.project.model.entity.User;
import com.amr.project.model.enums.Roles;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(@Qualifier("userDetailsServiceImpl") UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder() // UserDetails - минимальная информация о пользователях(Entity User можно приводить к этому виду)
                .username("user").password("1234").role(Roles.USER).build();

        UserDetails admin = User.builder() // UserDetails - минимальная информация о пользователях(Entity User можно приводить к этому виду)
                .username("admin").password("1111").role(Roles.ADMIN).build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/login","/logout").permitAll()
                .antMatchers("/**").access("hasAnyRole('ADMIN','USER')")
                .and().formLogin()
                .and().logout().logoutUrl("/logout")
                .logoutSuccessUrl("/login");

    }
}