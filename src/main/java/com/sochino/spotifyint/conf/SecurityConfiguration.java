package com.sochino.spotifyint.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/",
                        "/webjars/**",
                        "/swagger-ui.html",
                        "/configuration/security",
                        "/swagger-resources",
                        "/configuration/ui",
                        "/v2/api-docs",
                        "/api/spotify/**",
                        "/actuator/**",
                        "/api/test/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }
}
