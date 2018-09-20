package club;
import footballers.*;

public class Main {

	public static void main(String[] args) {
		Footballer player1 = new Messi();
		Footballer player2 = new Ronaldo();
		
		player1.paymentForPlay(2);
		player1.position();
		player1.nationality();
		
		player2.paymentForPlay(3);
		player2.position();
		player2.nationality();
	}

}
