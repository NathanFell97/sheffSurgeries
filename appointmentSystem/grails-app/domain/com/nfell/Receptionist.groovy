package com.nfell

class Receptionist {

	String recepName;
	String recepEmail;
	String recepUsername;
	String recepPassword; 
	int recepPhone;
	Surgery recepSurgery;
	
	String toString(){

	return recepName }

    static constraints = {

	recepName nullable: false, blank: false
	recepEmail nullable: false, blank: false
	recepUsername nullable: false, blank: false
	recepPassword nullable: false, blank: false
	recepPhone nullable: false, blank: false, maxSize: 11, minSize: 11
	recepSurgery nullable: false
	
    }
}
