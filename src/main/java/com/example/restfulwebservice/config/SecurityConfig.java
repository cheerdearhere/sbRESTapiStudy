package com.example.restfulwebservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

//Spring Security dependecy 처리 후 적용
//@Configuration
public class SecurityConfig{ //extends WebSecurityConfigurerAdapter{
//    @Override//모든 접속을 허용(테스트용)
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
//                .antMatchers("/h2-console/**")
//                .permitAll();//permit all
//        http.csrf().disable();//csrf check
//        http.headers().frameOption().disable();//i-frame option
//    }

    //    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception{
//        authentication.inMemoruAuthentication()
//                .withUser("kenneth")
//                .password("{noop}test1234")
//                .roles("USER");
//    }
}
