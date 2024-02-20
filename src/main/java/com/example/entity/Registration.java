package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Registration_Table")
@CrossOrigin(origins="http://localhost:3000/")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	
	private String FirstName;
	
	
	
	
	private String Email;
	
	//@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$")
	private String Password;
	

	
	
	private String Address;
	//@Pattern(regexp = "/^(\\d{3})[- ]?(\\d{3})[- ]?(\\d{4})$/")
	
	
	
	private String PhoneNo;
	//@Enumerated(EnumType.STRING)
	private String Role="USER";
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "RoleId",referencedColumnName = "RoleId")
//	private Role role;
	public Registration(Long id,String firstName,String email,
			String password, String address,String phoneNo) {
		super();
		Id = id;
		FirstName = firstName;
		Email = email;
		Password = password;
		Address = address;
		PhoneNo = phoneNo;
		
	}
	
	
}
