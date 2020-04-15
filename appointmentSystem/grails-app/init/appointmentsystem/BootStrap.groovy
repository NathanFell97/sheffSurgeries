package com.nfell

class BootStrap {

    def init = { servletContext ->

	def Norton=new Surgery(

	surgeryName: 'Norton Health Centre',
	address: '23 Sheffield Road',
	postcode: 'S56 5TR',
	telephone: '01142392495',
	numberOfPatients: '1379',
	description: 'Nortons Health Centre in the heart of the city',
	openingTime: '9:00am - 5:00pm').save()

	def Hillsborough=new Surgery(

	surgeryName: 'Hillsborough Health Centre',
	address: '17 Hillsborough Road',
	postcode: 'S66 5WR',
	telephone: '01709392495',
	numberOfPatients: '654',
	description: 'Hillsboroughs Health Centre in the heart of the city',
	openingTime: '9:00am - 5:00pm').save()

	
	def DrClarke=new Doctor(

	doctorName: 'Ian Clarke',
	qualification: 'Doctors Degree',
	position: 'Asthma Specialist',
	doctorEmail: 'ian.clarke@email.com',
	password: 'IanClarke',
	doctorOffice: 'D260',
	doctorPhone: '01142764532',
	bio: 'Asthma specialist graduated with a 1st from Oxford University',
	doctorSurgery: Norton).save()

	def DrDonald=new Doctor(

	doctorName: 'Patrick Donald',
	qualification: 'Doctors Degree',
	position: 'Dr',
	doctorEmail: 'patrick.donald@email.com',
	password: 'PatrickDonald',
	doctorOffice: 'D287',
	doctorPhone: '01142786541',
	bio: 'Dr graduated with a 1st from Leeds University',
	doctorSurgery: Norton).save()


	def Tracy=new Nurse(

	nurseName: 'Tracy Wheelhouse',
	qualifications: 'Btec Level 3',
	nurseEmail: 'tracy.wheelhouse@email.com',
	nurseOffice: 'D564',
	nursePhone: '01142876542',
	nurseSurgery: Norton).save()

	def Adam=new Nurse(

	nurseName: 'Adam Groff',
	qualifications: 'Nursing Degree',
	nurseEmail: 'adam.groff@email.com',
	nurseOffice: 'D289',
	nursePhone: '01142345897',
	nurseSurgery: Norton).save()

	def Tom=new Patient(

	patientName: 'Tom Ward',
	patientAddress: '34 Kings Drive',
	patientResidence: 'Sheffield Health Centre',
	patientDob:new Date('22/05/1990'),
	patientID: 'DG678',
	dateRegistered:new Date('04/08/2018'),
	patientPhone: '07654897563').save()

	def Billy=new Patient(

	patientName: 'Billy Brown',
	patientAddress: '21 Smith Way',
	patientResidence: 'Sheffield Health Centre',
	patientDob:new Date('14/07/1984'),
	patientID: 'DG987',
	dateRegistered:new Date('14/08/2017'),
	patientPhone: '07543567876').save()

	def Appointment1=new Appointment(
	
	appID: '1',
	appDate:new Date('08/03/2020'),
	appTime: '10:00am',
	appDuration: '15 Minutes',
	roomNumber: '8',
	patientName: Tom,
	appointmentDoctor: DrClarke).save()

	def Appointment2=new Appointment(
	
	appID: '2',
	appDate:new Date('11/03/2020'),
	appTime: '10:30am',
	appDuration: '15 Minutes',
	roomNumber: '4',
	patientName: Billy,
	appointmentDoctor: DrClarke).save()

	def DQW=new Prescription(
	
	prescriptionName: 'DQW',
	pharmacyName: 'Sheffield Health Centre Pharmacy',
	prescripNumber: '12679',
	medicine: 'Ibuprofen',
	totalCost: '5.69',
	dateIssued:new Date('04/02/2020'),
	patientPaying: 'Yes',
	prescriptionDoctor: DrClarke,
	prescriptionPatient: Tom).save()

	def DQR=new Prescription(
	
	prescriptionName: 'DQR',
	pharmacyName: 'Rotherham Health Centre Pharmacy',
	prescripNumber: '4657',
	medicine: 'Seretide',
	totalCost: '12.70',
	dateIssued:new Date('01/01/2020'),
	patientPaying: 'Yes',
	prescriptionDoctor: DrClarke,
	prescriptionPatient: Tom).save()

	
	def Hannah=new Receptionist(
	 
	recepName:'Hannah Marshal',
	recepEmail:'hannah.marshal@email.com',
	recepUsername:'hmarshal',
	recepPassword:'dogs123',
	recepPhone:'01142876758',
	recepSurgery: Norton).save()

	def Lucy=new Receptionist(
	
	recepName:'Lucy Smith',
	recepEmail:'lucy.smith@email.com',
	recepUsername:'lsmithh',
	recepPassword:'cats123',
	recepPhone:'01142876790',
	recepSurgery: Norton).save()

	
	//DrClarke.addToPrescriptions(DQW)
	//DrDonald.addToPrescriptions(DQR)

	//Norton.addToReceptionists(Hannah)
	

	


    }
    def destroy = {
    }
}
