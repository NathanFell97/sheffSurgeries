package com.nfell

class Prescription {

	

	String prescriptionName;
	String pharmacyName;
	int prescripNumber;
	String medicine;
	Double totalCost;
	Date dateIssued;
	Boolean patientPaying;
	Doctor prescriptionDoctor;
	Patient prescriptionPatient;

		String toString(){	
		return prescriptionName }
	
	

    static constraints = {
 
	prescriptionName nullable: false, blank: false
	pharmacyName nullable: false, blank: false
	prescripNumber nullable: false, blank: false
	medicine nullable: false, blank: false
	totalCost scale: 2
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false
	prescriptionDoctor blank: false
	prescriptionPatient blank: false
	
    }
}
