package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void doMedicine()
	{
		for(Patient p : patients)
		{
			p.checkPulse();
		}
	}
	
	public void assignPatient(Patient patient) throws DoctorFullException
	{
		if (patients.size() >= 3)
		{
			throw new DoctorFullException();
		}
		patients.add(patient);
	}
	public ArrayList<Patient> getPatients()
	{
		return patients;
	}
	
	public abstract boolean performsSurgery();
	public abstract boolean makesHouseCalls();
}
