package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
public class Blood1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long BoodId;
	@Column(length = 10)
	private String BloodGroup;
	
//	@OneToOne(mappedBy = "bloodGroup")
//	private Donor donor;
	@OneToOne(mappedBy = "blood1")
	private Donor donor;
	
	@OneToOne(mappedBy = "blood1")
	private Receiver receiver;
}
