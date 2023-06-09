package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testString=JOptionPane.showInputDialog("What is your test score?");
		double test=Double.parseDouble(testString);
		if(test>=80 && test<=100) {
			JOptionPane.showMessageDialog(null, "That is a great score!You studied really hard!!");
		}
		if(test<=79 && test>=51) {
			JOptionPane.showMessageDialog(null,"Thats an okay score,study more next time");
		}
		if(test<50) {
			JOptionPane.showMessageDialog(null,"You need to work a lot harder next time" );
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
