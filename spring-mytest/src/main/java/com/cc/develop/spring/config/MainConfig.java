package com.cc.develop.spring.config;

import com.cc.develop.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


@ComponentScan(value = "com.cc.develop.spring", includeFilters = {
		//标了controller注解的类都要排除
		//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)
})
@Configuration
public class MainConfig {

	// 给容器中注册一个Bean 类型为返

	/**
	 * 给容器中注册一个Bean 类型为返回值类型 id默认为方法名
	 *
	 * @return value 属性值 指定bean name
	 */
	@Bean(value = "person")
	public Person person() {
		return new Person(22, "lisi");
	}

}
