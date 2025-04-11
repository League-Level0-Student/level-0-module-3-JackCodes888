
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 17th";
		String dadsBirthday = "June 15th";
		String myBirthday = "June 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String who = JOptionPane.showInputDialog("Whose birhtday would you like be know.");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
		if (who.contains("dad")){
			JOptionPane.showMessageDialog(null,dadsBirthday);
			
		}else if(who.contains("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}else if(who.contains("Jack")) {
			JOptionPane.showMessageDialog(null,myBirthday);
		}else {
			JOptionPane.showMessageDialog(null, "Sorry I don't rembember "+who+"'s brithday.");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
