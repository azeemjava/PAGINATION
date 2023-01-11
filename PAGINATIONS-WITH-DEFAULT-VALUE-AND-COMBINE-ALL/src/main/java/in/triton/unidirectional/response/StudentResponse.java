package in.triton.unidirectional.response;


import lombok.Data;

@Data
public class StudentResponse {

	private String name;
	private int age;
	private String email;
	private String dept;
	
	
	private AdharCardResponse adharCard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public AdharCardResponse getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(AdharCardResponse adharCard) {
		this.adharCard = adharCard;
	}

	
	
}
