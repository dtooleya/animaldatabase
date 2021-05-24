package com.assignment2.dao;

import java.util.List;

import com.assignment2.model.Animal;

public interface AnimalDao {

	void create(Animal Animal);

	Animal get(int number);

	List<Animal> getAll();
}
