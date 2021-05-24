package com.assignment2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.assignment2.model.Animal;

@Repository
public class AnimalDaoImpl implements AnimalDao {
    @PersistenceContext
    private EntityManager entityManager;

    private static final Logger logger = LoggerFactory.getLogger(AnimalDaoImpl.class);
    
    public void create(Animal animal) {
    	logger.debug("*************************************************************create " + animal.getName());
        entityManager.persist(animal);
    }

    public Animal get(int number) {
        return entityManager.find(Animal.class, number);
    }
    

    @SuppressWarnings("unchecked")
    public List<Animal> getAll() {
    	return entityManager.createNamedQuery(
    			"Animal.getAll").getResultList();
    }	
}
