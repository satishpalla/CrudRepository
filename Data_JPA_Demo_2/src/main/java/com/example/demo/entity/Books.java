package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

	@Id
	@Column
	private Integer bid;
	@Column
	private String bname;
	@Column(name="book_Cost")
	private double bcost;
	
	
}
