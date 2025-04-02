package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class choose_your_own_adventure {

	public static void main(String[] args) {
		String message = "Today you are going to read a story, but not just any story, \n a choose your own adventure story.You will be tasked with making decisions.\nIf you like the first option enter 1 if you like the second option enter 2.";
        JOptionPane.showMessageDialog(null, message);
        
        
		String message2 = "The Speedcubing Showdown\n"
				 "You’ve been practicing for months. Your fingers have memorized the twists and turns of the Rubik's Cube. \nNow, it’s time for the big event: the national speedcubing competition. The best cubers \nfrom around the world have gathered in a huge arena, and the atmosphere is electric.\n"
				 "\n"
				+"You take a deep breath as your name is called. The spotlight is on you, and the crowd falls silent. \nYou’re ready, but there are many twists ahead. What will happen next? That’s up to you. You walk up to the stage, your heart pounding. In front of you, there’s a freshly scrambled Rubik’s Cube waiting to be solved. The timer starts in 3... 2... 1... and you're off!"+

You focus on the cube, your mind racing. The moves come easily at first, but as you approach the middle layer, you realize you've made a mistake. Your hands freeze for a moment. The clock is ticking."+
"What do you do?"+
"A) Try to fix the mistake by solving around it, hoping you can recover."+
"B) Pause, reset your focus, and restart the solution from the beginning."+
"C) Panic and start rushing, hoping the adrenaline will help you solve it faster.";
String choice1 = JOptionPane.showInputDialog(null, message2);
	}

}
