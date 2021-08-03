package com.cc.develop.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * com.cc.develop.spring
 *
 * @author changchen
 * @email java@mail.com
 * @date 2021-08-03 13:11:42
 */
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user() {
		return new User("001", "develop");
	}
}
