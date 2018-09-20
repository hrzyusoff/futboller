package footballers;

/**If there is a mixture of unique of generalize methods 
that your subclass will inherit then we should use abstract class
as the super class**/

public abstract class Footballer {
	
	private int wage = 500;
	
	public void paymentForPlay(int hours) {
		System.out.println("The player will make $"+hours*wage+" for a week");
	}
	public abstract void position();
	public abstract void nationality();
}
