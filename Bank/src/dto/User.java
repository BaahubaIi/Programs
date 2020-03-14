package dto;

public class User {
	String uname;
	String pwd;
	public User(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String passwd) {
		this.pwd = passwd;
	}
	@Override
	public String toString() {
		return "Users [uname=" + uname + ", passwd=" + pwd + "]";
	}
	

}
