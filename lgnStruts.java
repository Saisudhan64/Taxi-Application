package strutsdemo;

import com.opensymphony.xwork2.ActionSupport;
public class lgnStruts  extends ActionSupport{
	private String username;
	private String password;


	public String getUsername() {
		return username;
	}


	public void setUsername(final String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(final String password) {
		this.password = password;
	}

	public void validate() {
		
		if(this.username==null||this.username.trim().equals("")){
			this.addFieldError("username", "Please enter the username");
		
		}
		if(this.password==null||this.password.trim().equals("")){
			this.addFieldError("password", "Please enter the password");
		}

		
	}
	public String execute() {
		if(username.equals("sudhan")&&password.equals("123")){
			System.out.println("inside execute");
			return "success";
		}
		else {
			return "error";
		}
	}


}
