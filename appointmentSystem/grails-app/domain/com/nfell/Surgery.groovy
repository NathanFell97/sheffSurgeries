package com.nfell

class Surgery {


	String surgeryName;
	String address;
	String postcode;
	int telephone;
	int numberOfPatients;
	String description;
	String openingTime;
	

	static hasMany=[receptionists: Receptionist, doctors:Doctor, nurses:Nurse, patients:Patient]
	

	String toString(){

	return surgeryName

	}
	
    static constraints = {

	surgeryName nullable: false, blank: false
	address nullable: false, blank: false	
	postcode nullable: false, blank: false
	telephone nullable: false, blank: false, maxSize: 11, minSize: 11
	numberOfPatients nullable: false, blank: false, maxSize: 5, minSize: 1
	description nullable: false, blank: false
	openingTime nullable: false, blank: false
    }
}
