package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	private JLabel textLabel;//don't have action events
	private JButton colorButton;
	
	public SamplePanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("This is an instance of the JLabel class");
		this.colorButton = new JButton("Click to change color.");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	//installs pieces into the panel 
	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)//cannot add extra parameters to this method, name doesn't matter, what is happening
			{
				System.out.println("You clicked the button!");
				changeBackgroundColor();
			}
		}); //all one line of code, an anonymous inner class 
		
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 255); //math.random gives us 0 - .999999999999999999
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red: " + red + "     Green: " + green + "     Blue: " + blue);
	}
	
	

}
