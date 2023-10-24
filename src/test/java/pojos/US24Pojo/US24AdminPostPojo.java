package pojos.US24Pojo;

import java.util.List;
import java.io.Serializable;

public class US24AdminPostPojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String email;
	private String gender;
	private boolean isAdvisorTeacher;
	private List<String> lessonsIdList;
	private String name;
	private String password;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private String username;

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setIsAdvisorTeacher(boolean isAdvisorTeacher){
		this.isAdvisorTeacher = isAdvisorTeacher;
	}

	public boolean isIsAdvisorTeacher(){
		return isAdvisorTeacher;
	}

	public void setLessonsIdList(List<String> lessonsIdList){
		this.lessonsIdList = lessonsIdList;
	}

	public List<String> getLessonsIdList(){
		return lessonsIdList;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public US24AdminPostPojo() {
	}

	public US24AdminPostPojo(String birthDay, String birthPlace, String email, String gender, boolean isAdvisorTeacher, List<String> lessonsIdList, String name, String password, String phoneNumber, String ssn, String surname, String username) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.email = email;
		this.gender = gender;
		this.isAdvisorTeacher = isAdvisorTeacher;
		this.lessonsIdList = lessonsIdList;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
	}

	@Override
 	public String toString(){
		return 
			"US24AdminPostPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",email = '" + email + '\'' + 
			",gender = '" + gender + '\'' + 
			",isAdvisorTeacher = '" + isAdvisorTeacher + '\'' + 
			",lessonsIdList = '" + lessonsIdList + '\'' + 
			",name = '" + name + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}