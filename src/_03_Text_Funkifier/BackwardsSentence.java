package _03_Text_Funkifier;

public class BackwardsSentence implements TextFunkifier{
	
	private String unfunkifiedText;

    public BackwardsSentence(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
	@Override
	public String funkifyText() {
		String[] splitWords = unfunkifiedText.split(" ");
		String funkifiedText = "";
		for (int i = splitWords.length - 1; i >= 0 ; i--)
		{
			funkifiedText += splitWords[i];
			if (i > 0)
			{
				funkifiedText += " ";
			}
		}
		return funkifiedText;
	}

}
