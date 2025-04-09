package _02_loop_variables._1_years_alive;
import javax.swing.JOptionPane;
public class Yearsalive {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String years = JOptionPane.showInputDialog("How old are you turning this year?");
		
   int i = Integer.parseInt(years);
   for(;i > 0; i-=1) {
	   int year = (2025  - i);
	   System.out.println(year);
   }
	}

}
