import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final2019second2 extends ConsoleProgram {

	private int apples(int[][] m, ArrayList<String> instro) {
		int facing = 0;
		int count = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < instro.size(); i++) {
		
			if (instro.get(i).equals("left")) {
				facing ++;
			} if (instro.get(i).equals("move")) {
				if (frontIsClear(row, col, m, facing)) {
					if (facing % 4 == 0) {
						col++;
					}
					if (facing % 4 == 1) {
						
						row++;
					}
					if (facing % 4 == 2) {
						col--;

					}
					if (facing % 4 == 3) {
						row--;
					}
				}
				if(m[row][col] == 1){
					println(row);
					println(col);
					count ++;
					m[row][col] = 0;
				}
				
			}
			
			
		}
		return count;
	}

	private boolean frontIsClear(int row, int col, int[][] m, int facing) {
		if (facing % 4 == 0) {
			if (col == m[0].length - 1 || m[row][col + 1] == 2) {
				return false;
			}
		}
		if (facing % 4 == 1) {
			if (row == m.length - 1 || m[row+1][col] == 2) {
				return false;
			}
		}
		if (facing % 4 == 2) {
			if (col == 0 || m[row][col -1] == 2) {
				return false;
			}

		}
		if (facing % 4 == 3) {
			if (row == 0 || m[row-1][col] == 2) {
				return false;
			}
		}
		return true;
		
		
	}

	public void run() {
		int[][] m = { { 0, 0, 0, 0 }, { 1, 1, 2, 1 }, { 0, 1, 2, 1 }, { 0, 2, 0, 0 } };
		ArrayList<String> instro = new ArrayList<>();
		instro.add("move");
		for (int i = 0; i < 3; i++) {
			instro.add("left");
		}
		for (int i = 0; i < 3; i++) {
			instro.add("move");
		}
		for (int i = 0; i < 3; i++) {
			instro.add("left");
		}
		instro.add("move");
		for (int i = 0; i < 3; i++) {
			instro.add("left");
		}
		instro.add("move");
		println(apples(m, instro));
	}

}
