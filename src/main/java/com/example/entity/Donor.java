package com.example.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Donor_Table")
@CrossOrigin(origins="http://localhost:3000/")
public class Donor {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long DonorId;
	@NotNull
	@Embedded
	private Name name;
	
	@NotNull
	private Long Age;
	@NotNull
	private Long Weight;
	@NotNull
	private LocalDate Date;
	@NotNull
	private Long Quantity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RegistrationId",referencedColumnName = "Id")
	private Registration registrations;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CampId", referencedColumnName = "CampId")
	private Camp camps;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BoodId", referencedColumnName = "BoodId")
	private Blood1 blood1;
	
}
