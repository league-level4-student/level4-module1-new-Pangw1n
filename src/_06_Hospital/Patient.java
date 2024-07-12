package _06_Hospital;

public class Patient {
	private boolean feelsCaredFor = false;
	
	public void checkPulse()
	{
		feelsCaredFor = true;
	}
	
	public boolean feelsCaredFor()
	{
		return feelsCaredFor;
	}
}
