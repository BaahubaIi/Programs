import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args)
	{
	 ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	 Student s1=(Student) c.getBean("stu");
	 s1.getName();
	 
	}

}
