import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionBank {
	int id;
	String ques;
	Map<String,String> answers1;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public Map<String, String> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(Map<String, String> answers1) {
		this.answers1 = answers1;
	}
	public QuestionBank(int id, String ques, Map<String, String> answers1) {
		super();
		this.id = id;
		this.ques = ques;
		this.answers1 = answers1;
	}
	public void showAnswers()
	{
		System.out.println(id+")"+"question:"+ques);
		Set s=answers1.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
		    Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

	
	

}
