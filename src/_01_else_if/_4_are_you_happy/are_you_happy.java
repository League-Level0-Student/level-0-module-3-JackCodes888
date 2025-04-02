package _01_else_if._4_are_you_happy;

import java.util.Locale;

import javax.swing.JOptionPane;

public class are_you_happy {
	
public static void main(String[] args) {
	
	
String choice1 = JOptionPane.showInputDialog(null, "Are you happy? (yes/no) ");
if(choice1.contains("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
	
}else if (choice1.contains("no")) {

String choice2 = JOptionPane.showInputDialog( "Do you want to be happy? (yes/no)");
	
if (choice2.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Well then I think you need to get rid of somethingnin your life that is causing you grief.");
	
}else if (choice2.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, " Well  then keep doing what you are doing");
}
	
	
	
}else {
	JOptionPane.showMessageDialog(null,"What did you say?");
	
}
	
	
	
	
	
	
	
	
}

private static Locale contains(String string) {
	// TODO Auto-generated method stub
	return null;
}


}