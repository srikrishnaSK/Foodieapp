package com.foodieApp.food.dto;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.firewall.HttpStatusRequestRejectedHandler;

import com.foodieApp.food.entity.User;


public class SecUser implements UserDetails{
		
		private static final long serialVersionUID = 1667867666405067942L;
		
		private User user;
		
		public SecUser(User user) {
			//super();
			this.user = user;
		}
		public User getUser() {
			return user;
		}
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return AuthorityUtils.createAuthorityList( user.getRole() );
		}
		@Override
		public String getPassword() {
			
			return user.getPassword();
		}
		@Override
		public String getUsername() {
			return user.getUsername();
		}
		@Override
		public boolean isAccountNonExpired() {
			return true;
		}
		@Override
		public boolean isAccountNonLocked() {
			
			return true;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			
			return true;
		}
		@Override
		public boolean isEnabled() {
			return true;
		}
	}