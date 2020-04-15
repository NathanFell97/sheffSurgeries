package com.nfell

class Appointment {

	int appID;
	Date appDate;	
	String appTime;
	String appDuration;
	int roomNumber;
	Patient patientName;
	Doctor appointmentDoctor;
	
	String toString(){	
		return appID }

    static constraints = {

	appID blank: false
	appDate nullable: false, blank: false
	appTime nullable: false, blank: false
	appDuration nullable: false, blank: false
	roomNumber nullable: false, blank: false
	patientName nullable: false, blank: false
	appointmentDoctor blank: false
	
    }
}
