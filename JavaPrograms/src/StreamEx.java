import java.awt.List;
import java.util.*;

class Products
{
	int pid;
	String pname;
	float price;
	public Products(int pid,String pname,float price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
}
public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Products> al=new ArrayList<Products>();
		al.add(new Products(1001,"Apple",50000));
		al.add(new Products(1002,"Samsung",30000));
		al.add(new Products(1003,"Sony",50000));
		al.add(new Products(1003,"Apple",55000));
		al.add(new Products(1004,"Lg",50000));
		al.add(new Products(1005,"Sony",50000));
		al.add(new Products(1006,"Apple",900000));
		System.out.println("Product id of Apple brand products");
		al.stream().filter(pr->pr.pname=="Apple").forEach(pr -> System.out.println(pr.pid));  
		System.out.println("Max price among Apple brand products");
		 Products productB = al.stream()  
	                .max((product1, product2)->   
	                product1.price > product2.price ? 1: -1).get();  
	        System.out.println(productB.price);  
		
	}


}
