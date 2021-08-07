package com.cc.develop.spring.config;

import com.cc.develop.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * com.cc.develop.spring.config
 *
 * @author changchen
 * @email java@mail.com
 * @date 2021-08-07 14:43:05
 */
@Configuration
public class MainConfig2 {

	/**
	 * Specifies the name of the scope to use for the annotated component/bean.
	 * <p>Defaults to an empty string ({@code ""}) which implies
	 * {@link ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON}.
	 * @since 4.2
	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
	 * prototype:多实例的 ioc容器启动并不会去调用方法创建对象放在容器中，而是每次获取的时候才会调用方法创建对象
	 * singleton：单实例的(默认值) ioc容器启动会调用方法创建对象放到ioc容器中，以后每次获取就是直接从容器中拿
	 * request：同一次请求创建一个实例
	 * session：同一个session创建一个实例
	 */
	/**
	 * 默认都是单例的
	 *
	 * @return
	 */
	@Scope()
	/**
	 * 懒加载：
	 * 	     单实例bean:默认在容器启动的时候创建对象
	 * 	     懒加载：容器启动不创建对象，第一次使用(获取)Bean创建对象，并初始化
	 * @return
	 */
	@Lazy
	@Bean("person")
	public Person person() {
		System.out.println("给容器中创建Person.....");
		return new Person(20, "zhangsan");
	}

}
