package com.evelinweb.spring.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@EntityS
public class PersonForm {
	
	@NotNull
	@Size(min=2, max=30)
	private String name;
	
	@NotNull
	@Min(18)
	private Integer age;
	
	@Email
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		
		return "Person(Name: " + this.name + ", Age: " + this.age + ", Email: " + this.email + ")";
		
	}

}
