package org.springframework.my.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Author miqi.x
 * @Date 2021/4/26 16:43
 */
@Service
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService() {
		System.out.println("====================UserService 初始化了==================");
	}

	public void println(){
		System.out.println(indexService);
	}
}
