import javax.swing.JOptionPane;


public class DiceGame {

	public static void main(String[] args) {
	

		String username= null;
		String message=null;
		int diceCount=0;
		int playerGuess=0;
		int play = 1;
		diceCount=Integer.parseInt(JOptionPane.showInputDialog("Please tell me, How many dice would you like to play???"));
		Dice dice = new Dice(username,diceCount,0);
		message=String.format("Hi %s,\n Welcome to the Dice Game", dice.GetName());
		
		do{
			playerGuess= Integer.parseInt(JOptionPane.showInputDialog("Please either choose 1 for odd or 2 for even"));
			dice.DiceRoll();
			message=String.format("Dice number is %d", dice.DiceNumber());
			JOptionPane.showMessageDialog(null,message);
			
			if(playerGuess==1 && dice.CheckResult()==1)
			{
				JOptionPane.showMessageDialog(null, "You have won!");
				dice.SetPoint(1);
			}
			
			else
				JOptionPane.showMessageDialog(null, "Unfortunately, you have lost!");
			play=Integer.parseInt(JOptionPane.showInputDialog("Do you want play again? 1 for yes or 2 for no"));
		}
		while(play==1);
		JOptionPane.showMessageDialog(null, dice);
	}

}