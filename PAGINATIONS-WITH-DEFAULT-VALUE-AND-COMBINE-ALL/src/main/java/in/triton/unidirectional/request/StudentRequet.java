package in.triton.unidirectional.request;

import in.triton.unidirectional.entity.AdharCard;
import lombok.Data;

@Data
public class StudentRequet {

	private String name;
	private String email;
	private int age;
	private String dept;
	private AdharCard adharCard;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public AdharCard getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}	
	
	
	
}
