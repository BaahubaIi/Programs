import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterExamples.Personal;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		Personal b=(Personal)con.getBean("ques");
		b.data();
		
	
	
	}

}
