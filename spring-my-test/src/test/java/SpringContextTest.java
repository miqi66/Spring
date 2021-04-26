import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.my.config.AppConfig;
import org.springframework.my.service.IndexService;
import org.springframework.my.service.UserService;

/**
 * @Description TODO
 * @ClassName SpringContextTest
 * @Author miqi.x
 * @Date 2021/4/26 16:47
 */
public class SpringContextTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = context.getBean(IndexService.class);
		UserService userService = context.getBean(UserService.class);
		indexService.println();
		userService.println();
	}
}
