package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class SampleFrame extends JFrame
{
	//data members
	private GUIController appController;
	private SamplePanel appPanel;
	
	//Constructor
	public SampleFrame(GUIController appController)
	{
		super();//build the parent data members 
		this.appController = appController;
		this.appPanel = new SamplePanel(appController);
		
		setupFrame();
	}
	
	//helper method
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("This is a title");
		this.setSize(1000, 500);
		this.setResizable(true);
		this.setVisible(true);
	}

}
