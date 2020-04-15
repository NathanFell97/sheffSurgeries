package com.nfell

class Nurse {

	String nurseName;
	String qualifications;
	String nurseEmail;
	String nurseOffice;
	int nursePhone;
	Surgery nurseSurgery;
	
	String toString(){

	return nurseName}
	
    static constraints = {

	nurseName nullable: false, blank: false
	qualifications nullable: false, blank: false
	nurseEmail nullable: false, blank: false
	nurseOffice nullable: false, blank: false
	nursePhone nullable: false, blank: false, maxSize: 11, minSize: 11
	nurseSurgery blank: false
	
    }
}
