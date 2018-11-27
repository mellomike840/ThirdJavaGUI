package gui.controller;

public class GUIController
{
	public GUIController()
	{
		
	}
	
	public void start()
	{
		
	}
	
	public int returnConstant(int number, int repetitions)
	{
		int returnValue = number;
		
		for(int i = 0; i < repetitions; i++)
		{
			number += number;
		}
		
		return returnValue;
	}

}
