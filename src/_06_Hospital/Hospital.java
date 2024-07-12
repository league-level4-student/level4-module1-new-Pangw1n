package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor)
	{
		doctors.add(doctor);
	}
	
	public ArrayList<Doctor> getDoctors()
	{
		return doctors;
	}
	
	public void addPatient(Patient patient)
	{
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients()
	{
		return patients;
	}
	
	public void assignPatientsToDoctors()
	{
		for (int i = 0; i < patients.size(); i++)
		{
			try {
				doctors.get(i % doctors.size()).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
	}
}
