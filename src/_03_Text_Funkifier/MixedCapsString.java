package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String funkifiedText = "";
		for (int i = 0; i < unfunkifiedText.length(); i++)
		{
			if (i % 2 == 0)
			{
				funkifiedText += Character.toLowerCase(unfunkifiedText.charAt(i));
			}
			else
			{
				funkifiedText += Character.toUpperCase(unfunkifiedText.charAt(i));
			}
		}
		return funkifiedText;
	}

}
