package org.springframework.my.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName IndexService
 * @Author miqi.x
 * @Date 2021/4/26 16:42
 */
@Service
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService() {
		System.out.println("====================IndexService 实例化==================");
	}

	public void println(){
		System.out.println(userService);
	}
}
