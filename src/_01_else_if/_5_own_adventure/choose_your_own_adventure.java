package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class choose_your_own_adventure {

	public static void main(String[] args) {
		String message = "Today you are going to read a story, but not just any story, \n a choose your own adventure story."
				+ "You will be tasked with making decisions.\nIf you like the first option enter 1 if you like the second option enter 2.";
        JOptionPane.showMessageDialog(null, message);
        
        
        
	String message2 = "One day when you show up to school there is no one there. \nIt is 4/8/24 there are no holidays that you "
			+ "know about that day and and the time is 9:00. \nWhat do you do; A: start walking home and assume that there was a "
			+ "holiday that you didn't know about.\n Or B: Wait  it out and hope someone lets you in.";
String choice1 = JOptionPane.showInputDialog(null, message2);
	if(choice1.equalsIgnoreCase("a")) {
		String message3 = "On your way home you take a shortcut through the forest, \nbut when you think you are about to see the trail you don't see it. "
				+ "After wandering  \nfor a few more mintutes you don't see anyone or the trail. What do you do?\nA: Keep wandering, evantuly you will find you way out. \nOr B: Wait and"
				+ " hope that someone will find you ";
		String choice3 = JOptionPane.showInputDialog(null,message3);
		if (choice3.equalsIgnoreCase("a")) {
			JOptionPane.showMessageDialog(null, " You eventullay find your way out and get home. You then enjoy the res tof the day off!!!!");
		}else {
			JOptionPane.showMessageDialog(null, "Sorry no one found except a big hungry bear that ate you alive! sorry you're DEAD.");
		}
	}else if(choice1.equalsIgnoreCase("b")) {
	String	message4 =  "After 5 minutes someone sees you outside and come out to bring you in. They say,'Sorry we didn't see you we had a fire drill.' \n"
			+ "They then proceed to check you in and tell you what class to go to. You have a full day of \nschoolwork ahead of you but you feel good that you did the right thing. ";
	JOptionPane.showMessageDialog(null, message4);
	}else {
		JOptionPane.showMessageDialog(null,"Sorry I didn't here that so you are going to have to start again.");
	}
	}

}
