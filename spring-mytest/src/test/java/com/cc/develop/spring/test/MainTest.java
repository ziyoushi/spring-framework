package com.cc.develop.spring.test;

import com.cc.develop.spring.bean.Person;
import com.cc.develop.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * com.cc.develop.spring.test
 *
 * @author changchen
 * @email java@mail.com
 * @date 2021-08-06 20:37:34
 */
public class MainTest {

	public static void main(String[] args) {

		//之前采用配置文件的方式
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);*/

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);

		//bean定义信息
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		//根据bean类型获取bean name
		String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String name : beanNamesForType) {
			System.out.println(name);
		}

	}
}