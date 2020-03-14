import java.util.function.Predicate;

public class OddEve {
	
public static void main(String[] args)
{
	Predicate<Integer> pr=a->(a%2==0);
	
	System.out.println(pr.test(5));
}
}
