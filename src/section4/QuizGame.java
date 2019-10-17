package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		      int playerScore=0; 
		// 2.  Ask the user a question 
		 String Answer = JOptionPane.showInputDialog(null, "Whats 6x8?");
		// 3.  Use an if statement to check if their answer is correct
		 if (Answer.equalsIgnoreCase("48")) {
		// 4.  if the user's answer was correct, add one to their score 
		     playerScore += 1; }
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		 
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
