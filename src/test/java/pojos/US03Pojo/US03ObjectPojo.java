package pojos.US03Pojo;

import java.io.Serializable;

public class US03ObjectPojo implements Serializable {
	private String name;
	private String email;
	private String subject;
	private String message;
	private String date;

	public US03ObjectPojo() {
	}

	public US03ObjectPojo(String name, String email, String subject, String message, String date) {
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
		this.date = date;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"name = '" + name + '\'' + 
			",email = '" + email + '\'' + 
			",subject = '" + subject + '\'' + 
			",message = '" + message + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}