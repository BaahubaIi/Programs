public class Employee {
	String name;
	int id;
	
	public Employee(int value,String message) {
		System.out.println("Hello from Constructor..."+value+" "+message);
	}
	public void getName() {
		System.out.println("Employee name is"+" "+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void  getId() {
		System.out.println("Employee id is"+" "+id);;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void showDetails() {
		System.out.println("Employee name : "+name+"Employee id : "+id);
	}

}
