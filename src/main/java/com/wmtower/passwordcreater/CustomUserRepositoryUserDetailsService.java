package com.wmtower.passwordcreater;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.wmtower.passwordcreater.dao.CustomUserRepository;
import com.wmtower.passwordcreater.entity.CustomUser;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @author liuyf90
 **/
@Service
public class CustomUserRepositoryUserDetailsService implements UserDetailsService {

	private final CustomUserRepository userRepository;

	public CustomUserRepositoryUserDetailsService(CustomUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CustomUser customUser = this.userRepository.findCustomUserByName(username);
		if (customUser == null) {
			throw new UsernameNotFoundException("username " + username + " is not found");
		}
		return new CustomUserDetails(customUser);
	}

	static final class CustomUserDetails extends CustomUser implements UserDetails {

		private static final List<GrantedAuthority> ROLE_USER = Collections
				.unmodifiableList(AuthorityUtils.createAuthorityList("ROLE_USER"));

		CustomUserDetails(CustomUser customUser) {
			super(customUser.getId(), customUser.getName(), customUser.getPassword());
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return ROLE_USER;
		}

		@Override
		public String getUsername() {
			return getName();
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

}
