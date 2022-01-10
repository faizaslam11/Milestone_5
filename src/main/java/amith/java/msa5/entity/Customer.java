package amith.java.msa5.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	private Long id;
	private String name;
	private String gender;
	private int age;
	private String preferredfood;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long i, String name, String gender, int age, String preferredfood) {
		super();
		this.id = i;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferredfood = preferredfood;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPreferredfood() {
		return preferredfood;
	}

	public void setPreferredfood(String preferredfood) {
		this.preferredfood = preferredfood;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", preferredfood="
				+ preferredfood + "]";
	}
	

}
