package com.assignment2.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment2.model.Animal;
import com.assignment2.service.AnimalService;
import com.fasterxml.jackson.databind.ObjectMapper;


// mvn spring-boot:run
@RestController
@EnableAutoConfiguration
public class AnimalController {

	    @Autowired
	    private AnimalService animalService;

	    private static final Logger logger = LoggerFactory.getLogger(AnimalController.class);

	    
	    @PostConstruct
		public void createAnimals() {
			logger.debug("create animals");
			
			Animal animal = new Animal("Dog","Dogs are known as man's best friend; they are loyal, sweet, and like to play");
			animalService.create(animal);

			animal = new Animal("Cat","Cats are independent animals; they can be very lazy, mischievous, and fluffy");
			animalService.create(animal);

			animal = new Animal("Rabbit","Rabbits are fast little animals and are often very shy");
			animalService.create(animal);
			
			animal = new Animal("Bird","Birds are unique animals that can fly; they often make their homes in trees");
			animalService.create(animal);
			
			animal = new Animal("Turtle","Turtles have shells that protect them from enemies and are often very slow animals");
			animalService.create(animal);
			
			animal = new Animal("Raccoon","Raccoons are troublemakers that are often found digging in the trash for food");
			animalService.create(animal);
			
			animal = new Animal("Fish","Fish are unique creatures that live within bodies of water and breathe using gills");
			animalService.create(animal);
			
			animal = new Animal("Squirrel","Squirrels are fast animals that like to climb trees and look for nuts");
			animalService.create(animal);
			
			animal = new Animal("Mouse","Mice are tiny animals with long thin tails often found hiding in nooks and crannies");
			animalService.create(animal);
			
			animal = new Animal("Elephant","Elephants are very large animals with long trunks, tusks, and big ears");
			animalService.create(animal);
			
			
		}

	    /**
	     * 
	     * Retrieve specific animal
	     * Syntax: http://localhost:8080/1
	     * 
	     * @param id
	     * @return JSON String
	     * 
	     */
	    @CrossOrigin
	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	    public String get(@PathVariable String id) {
	        logger.info("Getting animal with id " + id);

	        try {
	            Animal animal = animalService.get(Integer.parseInt(id));
	            
	    		ObjectMapper mapper = new ObjectMapper();
	            String jsonAnimal = mapper.writeValueAsString(animal);
	            return jsonAnimal;
	        } catch (Exception e) {
	            logger.error("Error occurred while trying to get an animal", e);
	            return e.getMessage();
	        }
	    }
	    /**
	     * 
	     * Retrieve all Animals
	     * Syntax: http://localhost:8080
	     * @return JSON String of all animals
	     */
	    // retrieval All as JSON http://localhost:8080/
	    @CrossOrigin
	    @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String get(HttpServletResponse r) {
	        logger.info("Getting all animals");

	        try {
	            List<Animal> animals = animalService.getAll();
	            
	    		ObjectMapper mapper = new ObjectMapper();
	            String jsonAnimal = mapper.writeValueAsString(animals);
	            return jsonAnimal;
	        } catch (Exception e) {
	            logger.error("Error occurred while trying to get an animal", e);
	            return e.getMessage();
	        }
	    }
	    
	}
