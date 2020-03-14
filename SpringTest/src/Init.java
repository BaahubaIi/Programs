
public class Init implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean,String beanName) {
		System.out.println("Bean before Initialization");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean,String beanName) {
		System.out.println("Bean after Initialization");
		return bean;
	}

}
