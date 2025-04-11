
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like banananananananananananannanananananas?");
		//2. if they say no, 
		if(banana.contains("no")) {
				JOptionPane.showMessageDialog(null,"Tu estas muy loco!");
		
		}else if(banana.contains("yes")) {
			String hobby = JOptionPane.showInputDialog("What is your hobby?");
			JOptionPane.showMessageDialog(null,"Is your hobby, " +hobby+" better than banananananananananaananananananananananananana?");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}
