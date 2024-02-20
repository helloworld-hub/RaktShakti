package com.example.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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
public class BloodBank {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long BloodBankId;
	@NotNull
	private Long AvailableQuantity;
	@NotNull
	private String BloodBankName;
	@NotNull
	private String Location;
	
	
}
