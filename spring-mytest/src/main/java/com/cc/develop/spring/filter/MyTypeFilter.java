package com.cc.develop.spring.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * com.cc.develop.spring.filter
 *
 * @author changchen
 * @email java@mail.com
 * @date 2021-08-07 14:27:35
 */
public class MyTypeFilter implements TypeFilter {

	/**
	 * 返回true匹配成功 false匹配失败
	 *
	 * @param metadataReader        the metadata reader for the target class 读取到的当前正在扫描的类的信息
	 * @param metadataReaderFactory a factory for obtaining metadata readers
	 *                              for other classes (such as superclasses and interfaces) 可以获取到其他任何类的信息
	 * @return
	 * @throws IOException
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		//获取当前类的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//获取当前类资源(类路径)
		Resource resource = metadataReader.getResource();

		String className = classMetadata.getClassName();
		System.out.println("获取当前类是类名：" + className);

		//自定义过滤规则
		if (className.contains("er")) {
			return true;
		}
		return false;
	}
}
