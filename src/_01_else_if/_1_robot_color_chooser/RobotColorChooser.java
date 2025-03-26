
package _01_else_if._1_robot_color_chooser;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot r = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		//3. Set the pen width to 10
		r.setPenWidth(10);
		r.setSpeed(100);
		r.penDown();
		while(true) {
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want me to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("red")) {
		
		}else if(color.equalsIgnoreCase("orange")) {
			r.setPenColor(255,0,0);
		}else if(color.equalsIgnoreCase("yellow")) {
			r.setPenColor(Color.yellow);
		}else if(color.equalsIgnoreCase("green")) {
			r.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("blue")) {
			r.setPenColor(Color.blue);
		}else if(color.equalsIgnoreCase("purple")) {
			r.setPenColor(Color.MAGENTA);
		}else {
			r.setRandomPenColor();
		}
		
		for(int e = 90; e <450; e+=90) {
			r.move(100);
			
			
			r.setAngle(e);
			
		}
		
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
