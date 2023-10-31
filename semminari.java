import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class semminari extends ConsoleProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		//RandomGenerator rgen = new RandomGenerator();
		for(int i =0; i < 100; i++){
		int randomInt = rgen.nextInt(1,2);
		print(randomInt);
		}
	    
	}
}
