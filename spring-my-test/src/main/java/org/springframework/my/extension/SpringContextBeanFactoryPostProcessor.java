package org.springframework.my.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.my.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * @Description spring BeanFactory工厂扩展处理类
 * @ClassName SpringContextBeanFactoryPostProcessor
 * @Author miqi.x
 * @Date 2021/4/26 20:13
 */
// @Component
public class SpringContextBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	/**
	 * (1) scan 根据配置扫描所有在扫描范围的class类
	 * (2) parse 解析class类，生成BeanDefiniton对象，put到beanDefinitionMap中
	 * (3) 调用扩展，BeanFactoryPostProcessor实现类
	 * (4) validate，校验，循环实例化单列对象
	 */

	/**
	 * @Description  spring的bean工厂扩展类
	 * @Date 2021/4/26 20:16
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		GenericBeanDefinition orderServiceBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("orderService");
		orderServiceBeanDefinition.setBeanClass(ProductService.class);
	}
}
