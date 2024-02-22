package com.app.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="state")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class State extends BaseEntity{
	@Column(length = 30)
	private String name;	
}
