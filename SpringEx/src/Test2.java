import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args)
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("spring-bean.xml");
		Person p=(Person) c.getBean("per");
		Address a=(Address) c.getBean("addr");
	}

}
