import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Final2020second2 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		double n = 10000000;
		println(kazino(n));
	}
	private double kazino(double n) {
		double wins = 0.0;
		for (int i = 0; i < 1000; i++) {
			boolean first = true;
			double lostMoney = 0.0;

			while (true) {

				int myGuess = rgen.nextInt(0, 36);
				double bet = (lostMoney + 1) / 36;
				if (first) {
					bet = 1;
					first = false;
				}
				int actual = rgen.nextInt(0, 36);
				if (myGuess == actual) {
					wins++;
					break;
				} else {
					n -= bet;
					lostMoney += bet;
					if (n <= 0) {
						break;
					}
				}
			}
		}
		return wins/1000;

	}
}
