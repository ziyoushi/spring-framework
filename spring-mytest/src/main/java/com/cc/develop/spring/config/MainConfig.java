package com.cc.develop.spring.config;

import com.cc.develop.spring.bean.Person;
import com.cc.develop.spring.filter.MyTypeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * includeFilters 只包含
 * excludeFilters 排除
 * useDefaultFilters 默认过滤，如果配置过滤规则的话 一定要设置成false
 * FilterType.ANNOTATION 按照注解过滤
 * FilterType.ASSIGNABLE_TYPE 按照给定的类型
 * FilterType.CUSTOM 自定义过滤规则
 */
@ComponentScan(value = "com.cc.develop.spring", includeFilters = {
		/*@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),*/
		@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)
}, useDefaultFilters = false)
@Configuration
public class MainConfig {

	/**
	 * 给容器中注册一个Bean 类型为返回值类型 id默认为方法名
	 * @return value 属性值 指定bean name
	 */
	@Bean(value = "person")
	public Person person() {
		return new Person(22, "lisi");
	}

}
