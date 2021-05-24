var selectAnimal = document.createElement("select");
selectAnimal.id = "selectAnimals";
selectAnimal.onchange = function() {
	getResult()
};

function createDropDown(animalarr) {
	var div = document.createElement("div");
	div.innerHTML = 'Select an animal:    ';

	for (var i = 0; i < animalarr.length; i++) {
		var options = document.createElement("option");
		options.text = (i + 1).toString() + " - " + animalarr[i].name;
		options.value = animalarr[i].description;
		selectAnimal.appendChild(options);
	}
	div.appendChild(selectAnimal);

	document.body.appendChild(div);
}

function jsonGetDropdown() {
	let request = new XMLHttpRequest();
	request.open("GET", "http://localhost:8080/");
	request.onload = function() {
		var data = JSON.parse(this.response)
		
		var animalarr = [  ];
		var cntr=0;
		data.forEach((animal) => {
			var animal = {
					number : animal.number,
					name : animal.name,
					description : animal.description
				};
			animalarr[cntr++] =animal;
  			console.log(animal);
		})
		createDropDown(animalarr);
	}
	request.send();
	// var data = JSON.parse(this.response)
	// alert(data);
}

function getResult() {
	var result = selectAnimal.value;
	document.getElementById("animalDesc").innerHTML = result;
}

