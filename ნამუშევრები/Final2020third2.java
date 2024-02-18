import acm.program.ConsoleProgram;

public class Final2020third2 extends ConsoleProgram{
	public void run(){
		
	}
	private void circly(int[][] m){
		int currRow = 0;
		int currCol = 0;
		int facing = 0;
		
		while(true){
			int number = 1;
			putNum(number, m, currRow, currCol);
			if(frontIsClear(m, currRow, currCol, facing)){
				if(facing == 0){
					currRow ++;
				}
				if(facing == 1){
					currCol ++;
				}
				if(facing == 2){
					currRow --;
				}
				if(facing == 3){
					currCol --;
				}
			}else{
				facing = (facing +1) % 4;
				if(!frontIsClear(m, currRow, currCol, facing)){
					break;
				}
			}
			number ++;
		}
	}
	private void putNum(int number, int[][] m, int currRow, int currCol) {
		m[currRow][currCol] = number;
		
	}
	private boolean frontIsClear(int[][] m, int currRow, int currCol, int facing) {
		if(facing == 0){
			currRow ++;
		}
		if(facing == 1){
			currCol ++;
		}
		if(facing == 2){
			currRow --;
		}
		if(facing == 3){
			currCol --;
		}
		if(currRow < 0 || currRow > m[0].length){
			return false;
		}
		if(currCol < 0 || currCol > m.length){
			return false;
		}
		if(m[currRow][currCol] != 0){
			return false;
		}
		return true;
	}
}
