package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	boolean canMakeHouseCalls;
	
	boolean canPerformSurgery;
	
	public void doMedicine()
	{
		for(Patient p : patients)
		{
			p.treat();
		}
	}
	
	public void assignPatient(Patient patient)
	{
		patients.add(patient);
	}
	public ArrayList<Patient> getPatients()
	{
		return patients;
	}
}
