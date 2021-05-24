package com.assignment2.model;

import javax.persistence.*;

@Entity
@Table(name = "Animals")
@NamedQuery(
    name = "Animal.getAll",
    query = "SELECT a FROM Animal a")
public class Animal {
	
	// Constructor
	public Animal(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int number;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;

	public Animal() {
	}

	public Animal(String name, int number, String description) {
		this.name = name;
		this.number = number;
		this.description = description;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
