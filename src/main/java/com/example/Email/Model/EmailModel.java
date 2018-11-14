package com.example.Email.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class EmailModel {

	@NotEmpty
	  @Size(min=1,max=20)
	 	@Pattern(regexp="^[A-Za-z]*$")
	private String name;
	
	
	
	
	@NotNull(message = "Email Id is required")
	@Size(min = 5, max = 50, message = "Invalid length for email")
	@Pattern(message = "Invalid email id", regexp = "^.+@.+\\..+$")
	private String eMail;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
    
    
    
    
    
    
    
}
