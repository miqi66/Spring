package org.springframework.my.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName ProductService
 * @Author miqi.x
 * @Date 2021/4/26 20:20
 */
@Component
public class ProductService implements ApplicationContextAware {

	public ProductService() {
		System.out.println("==============ProductService 实例化===========");
	}

	@PostConstruct
	public void init(){
		System.out.println("call productService lifecycle callback");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("call aware callback");
	}
}
