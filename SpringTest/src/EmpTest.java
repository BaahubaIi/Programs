

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("springbean.xml");
		Employee e=(Employee)cont.getBean("student");
		e.getName();
		e.showDetails();
		
	}

}
