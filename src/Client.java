import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("resouces/spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Test test = (Test) beanFactory.getBean("t");
		test.hello();

		Test test2 = (Test) beanFactory.getBean("t");
		Test test3 = (Test) beanFactory.getBean("t");
		System.out.println(test == test2);
		System.out.println(test2 == test3);
	}
}
