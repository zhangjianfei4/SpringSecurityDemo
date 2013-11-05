package com.hskj.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
    	System.out.println("fillter-->"+username);
        List<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();
        
//        if(username.equals("robin1")){
//            auths=new ArrayList<GrantedAuthority>();
//            GrantedAuthorityImpl auth1=new GrantedAuthorityImpl("ROLE_ROBIN");
//            auths.add(auth1);
//        }
        
//        User(String username, String password, boolean enabled, boolean accountNonExpired,
//                    boolean credentialsNonExpired, boolean accountNonLocked, Collection<GrantedAuthority> authorities) {
        UserDetails user = null;
        if(username.equals("admin")){
        	GrantedAuthorityImpl auth2=new GrantedAuthorityImpl("ROLE_ADMIN");
            auths.add(auth2);
        	user = new User("admin",
                "123", true, true, true, true, auths);
        }
        if(username.equals("other")){
        	GrantedAuthorityImpl auth2=new GrantedAuthorityImpl("ROLE_OTHER");
            auths.add(auth2);
        	user = new User("other",
        			"123", true, true, true, true, auths);
        }
        return user;
    }
    
}