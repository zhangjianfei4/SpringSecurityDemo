package com.hskj.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	TestDAO testDAO;
	public Map<String, Collection<ConfigAttribute>> get(Map<String, Collection<ConfigAttribute>> resourceMap){
		System.out.println(testDAO.getdao());
		resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
        Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
        ConfigAttribute ca11 = new SecurityConfig("ROLE_ADMIN");
        ConfigAttribute ca12 = new SecurityConfig("ROLE_DEV");
        atts.add(ca11);
        atts.add(ca12);
        
        Collection<ConfigAttribute> atts2 = new ArrayList<ConfigAttribute>();
        ConfigAttribute ca21 = new SecurityConfig("ROLE_OTHER");
        atts2.add(ca21);
        //获取url 每个url所对应的角色有那些 
        resourceMap.put("/login.do", atts);
        resourceMap.put("/test.do", atts);
        
        resourceMap.put("/other.do", atts2);
		return resourceMap;
	}
}
