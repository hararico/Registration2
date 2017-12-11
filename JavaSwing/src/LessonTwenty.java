
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

// You must extend the JFrame class to make a frame
// After git
//
public class LessonTwenty extends JFrame{
	public static void main(String[] args){
		new LessonTwenty();
	}
	
	public LessonTwenty(){
		this.setSize(400, 400);
		System.out.println(" After   OL");
		System.out.println(" After   Khadia");
		System.out.println(" After   Khadia 33");
		
		// Opens the frame in the middle of the screen------------------------------------------
		// You could also define position based on a component                   |

		// this.setLocationRelativeTo(null);
		// Toolkit is the super class for the Abstract Window Toolkit
		//It allows us to ask questions of the OS
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		// A Dimension can hold the width and height of a component

		// getScreenSize returns the size of the screen

		Dimension dim = tk.getScreenSize();

		// dim.width returns the width of the screen
		// this.getWidth returns the width of the frame you are making
		int xPos = (dim.width / 2) - (this.getWidth() / 2);

		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		// You could also define the x, y position of the frame

		this.setLocation(xPos, yPos);

		// Define how the user exits the program

// This closes when they click the close button

// Define if the user can resize the frame (true by default)

this.setResizable(false);

		// Define how the frame exits (Click the Close Button)

		// Without this Java will eventually close the app

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("My First Frame");

		JPanel thePanel = new JPanel();

		JLabel label1 = new JLabel("Tell me something");
		label1.setText("New Text");

		label1.setToolTipText("Doesn't do anything");

		thePanel.add(label1);
		JButton button1 = new JButton("Send");
		button1.setBorderPainted(false);

		button1.setContentAreaFilled(false);
		button1.setText("New Button");

		button1.setToolTipText("Doesn't do anything either");

		thePanel.add(button1);

		JTextField textField1 = new JTextField("Type Here", 15);

		textField1.setColumns(10);

		textField1.setText("New Text Here");

		textField1.setToolTipText("More of nothing");

		thePanel.add(textField1);

		JTextArea textArea1 = new JTextArea(15, 20);

		textArea1.setText("Just a whole bunch of text that is important\n");

		textArea1.setLineWrap(true);

		textArea1.setWrapStyleWord(true);

		int numOfLines = textArea1.getLineCount();

		textArea1.append(" number of lines: " + numOfLines);

		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(scrollbar1);

		this.add(thePanel);

		this.setVisible(true);

		textField1.requestFocus();

	
	}
}