package com.nfell

class Doctor {
		

	String doctorName;
	String qualification;
	String position;
	String doctorEmail;
	String password;
	String doctorOffice;
	Integer doctorPhone;
	String bio;
	Surgery doctorSurgery;
	

	static hasMany=[prescriptions:Prescription, appointments:Appointment, nurses:Nurse, patients:Patient]
	
	String toString(){	
		return doctorName}

    static constraints = {

	doctorName nullable: false, blank: false
	qualification nullable: false, blank: false	
	position nullable: false, blank: false
	doctorEmail nullable: false, blank: false
	password nullable: false, blank: false
	doctorOffice nullable: false, blank: false
	doctorPhone nullable: false, blank: false, maxSize: 11, minSize: 11
	bio nullable: false, blank: false
	doctorSurgery blank: false 
	
	
    }
}
