package au.com.ankys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrdermgntApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(OrdermgntApplication.class, args);
		System.out.println("Application Name:" + ac.getApplicationName());
		System.out.println("bean definition count: " + ac.getBeanDefinitionCount());
		String[] names = ac.getBeanDefinitionNames();
		int i = 0;
		for (final String name : names) {
			System.out.print("=== name " + i + " : " + name);
			System.out.print("  type: " + ac.getBean(name).getClass().getName() );
			System.out.println(" singleton: " + ac.isSingleton(name));
			i++;
		}

	}
}
