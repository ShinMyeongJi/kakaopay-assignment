package com.kakao.pay.kakaopayassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

/**
 * packageName :  com.kakao.pay.kakaopayassignment.config
 * fileName : WebSecurityConfig
 * author :  home
 * date : 22. 10. 17.
 * description :
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        try{
            http.csrf().disable();
        }catch (Exception e) {

        }
        return http.build();
    }
}
