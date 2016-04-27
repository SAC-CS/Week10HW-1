

public class Dice {
	private int diceNumber=0;
	private int point=0;
	private int diceCount=0;
	private String username=null;
	private int diceResult=0;
	public Dice(String name,int diceCount,int point)
	{
		username=name;
		this.diceCount=diceCount;
		this.point=point;
	}
	public String GetName()
	{
		return username;
	}
	public void SetPoint(int point)
	{
		this.point=point+this.point;
	}
	public void DiceRoll()
	{
		diceNumber=diceCount*(1+(int)(Math.random()*6));
	}
	public int CheckResult()
	{
		if(diceNumber%2==0)
			diceResult=2;
		else diceResult=1; 
		return diceResult;
	}
	public int DiceNumber()
	{
		return diceNumber;
	}
	public String toString()
	{
		return String.format("%s,\nplayed with %d dices.\nTotal points: %d", username, diceCount, point);
	}
}