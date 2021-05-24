package com.assignment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assignment2.dao.AnimalDao;
import com.assignment2.model.Animal;

@Service
@Transactional
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalDao animalDao;

    public void create(Animal Animal) {
    	animalDao.create(Animal);
    }

    public Animal get(int number) {
        return animalDao.get(number);
    }  

    public List<Animal> getAll() {
      return animalDao.getAll();
   }
}

