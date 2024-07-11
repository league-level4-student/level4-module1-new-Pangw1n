package _06_Hospital;

public class Patient {
	private boolean feelsCaredFor = false;
	
	public void checkPulse()
	{
		
	}
	
	public boolean feelsCaredFor()
	{
		return feelsCaredFor;
	}
	
	public void treat()
	{
		feelsCaredFor = true;
	}
}
