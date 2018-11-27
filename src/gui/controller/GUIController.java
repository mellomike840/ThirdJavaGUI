package gui.controller;

import gui.view.SampleFrame;

public class GUIController
{
	private SampleFrame appFrame;
	
	public GUIController()
	{
		appFrame = new SampleFrame(this);
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
