package com.assignment2.service;


import java.util.List;

import com.assignment2.model.Animal;

public interface AnimalService {
    
	void create(Animal animal);
    
	Animal get(int number);
   
    List<Animal> getAll();
}
