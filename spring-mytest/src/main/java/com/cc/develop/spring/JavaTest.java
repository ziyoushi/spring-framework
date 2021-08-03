package com.cc.develop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * com.cc.develop.spring
 *
 * @author changchen
 * @email java@mail.com
 * @date 2021-08-03 13:13:03
 */
public class JavaTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
