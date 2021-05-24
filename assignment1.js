var selectAnimal = document.createElement("select");
selectAnimal.id = "selectAnimals";
selectAnimal.onchange = function() {getResult()};

document.addEventListener('DOMContentLoaded', function() {
	var div = document.createElement("div");
    div.innerHTML = 'Select an animal:    ';
	
	for (var i = 0; i < animalarr.length; i++)
	{
		var options = document.createElement("option");
		options.text = (i+1).toString()+" - "+animalarr[i].name;
		options.value = animalarr[i].description;
		selectAnimal.appendChild(options);
	}
	div.appendChild(selectAnimal);
 
    document.body.appendChild(div);
}, false);

function getResult(){
	var result = selectAnimal.value;
	document.getElementById("animalDesc").innerHTML = result;
}


var dog = 	   {number: 1,  name: "Dog", 	  description: "Dogs are known as man's best friend; they are loyal, sweet, and like to play"};
var cat = 	   {number: 2,  name: "Cat", 	  description: "Cats are independent animals; they can be very lazy, mischievous, and fluffy"};
var rabbit =   {number: 3,  name: "Rabbit",   description: "Rabbits are fast little animals and are often very shy"};
var bird = 	   {number: 4,  name: "Bird", 	  description: "Birds are unique animals that can fly; they often make their homes in trees"};
var turtle =   {number: 5,  name: "Turtle",   description: "Turtles have shells that protect them from enemies and are often very slow animals"};
var raccoon =  {number: 6,  name: "Raccoon",  description: "Raccoons are troublemakers that are often found digging in the trash for food"};
var fish = 	   {number: 7,  name: "Fish",     description: "Fish are unique creatures that live within bodies of water and breathe using gills"};
var squirrel = {number: 8,  name: "Squirrel", description: "Squirrels are fast animals that like to climb trees and look for nuts"};
var mouse =    {number: 9,  name: "Mouse",    description: "Mice are tiny animals with long thin tails often found hiding in nooks and crannies"};
var elephant = {number: 10, name: "Elephant", description: "Elephants are very large animals with long trunks, tusks, and big ears"};
var animalarr = [dog,cat,rabbit,bird,turtle,raccoon,fish,squirrel,mouse,elephant];
