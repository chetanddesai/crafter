/**
 * @(#)Crafter.java
 *
 * Crafter application
 *
 * @author Chetan Desai
 * @version 1.00 2006/10/21
 */

import java.lang.System;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
 
public class Crafter extends JPanel implements ActionListener {
    
    public Crafter() {
        super(new BorderLayout());

        JButton button = new JButton("Knock That Shit Off!");
        button.addActionListener(this);
        
        add(button, BorderLayout.PAGE_START);

    }

    /** Handle the button click. */
    public void actionPerformed(ActionEvent e) {
    	
        // Byeee
        System.exit(0);
        
    }

    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Crafter();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    
    public static void main(String[] args) throws AWTException {
    	
    	// Create the robot
    	Robot myRobo = new Robot();
    	
    	// ---------------------------------------------------
    	// MODIFY THE FOLLOWING VARIABLES TO CHANGE DELAY TIME
    	// ---------------------------------------------------
    	// Set duration to time inbetween crafts in millisec
    	// it can only go from 0-60000 ms so combine 2 of them
    	// Add in 2 extra seconds for lag purposes.
    	int duration = 4000;
    	//int duration2 = 18000;
    	
    	// Da close button
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
    		public void run() {
    			createAndShowGUI();
    		}
    	});
    	
    	
    	// A quick 2 sec delay so we can alt tab back to the game (e.g DAoC)
    	myRobo.delay(2000);
    	
    	// Run'r
    	while(true) {
    		
            // Set the KeyEvent you want to click
    		myRobo.keyPress(KeyEvent.VK_2);
    		myRobo.delay(duration);
    		// Uncomment the following line if you need to add in the additional delay.
    		//myRobo.delay(duration2);
    		
    	}
    }
}
