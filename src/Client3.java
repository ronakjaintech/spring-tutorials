import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client3 {
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("resouces/spring_2.0.xml");
		Test test = (Test) beanFactory.getBean("t");
		test.hello();

		Test test2 = (Test) beanFactory.getBean("t");
		Test test3 = (Test) beanFactory.getBean("t");
		System.out.println(test == test2);
		System.out.println(test2 == test3);
	}
}
