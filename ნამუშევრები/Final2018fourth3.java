import acm.program.ConsoleProgram;

public class Final2018fourth3 extends ConsoleProgram {
	public void run() {
		int[][] m =  { { 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 1, 1, 0 }, { 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 0, 0, 1, 1, 0 }, { 0, 0, 1, 0, 0, 1, 0, 0 } };
		println(plus(m));
	}

	private int plus(int[][] m) {
		int maxSize = 1;
		for (int i = 1; i < m.length - 1; i++) {
		
			for (int j = 1; j < m[0].length - 1; j++) {
			
				if (m[i][j] == 1) {

					int index1 = i;
					int index2 = j;
					int upperOnes = findUp(index1, index2, m);
					int lowerOnes = findLow(index1, index2, m);
					int rightOnes = findRight(index1, index2, m);
					int leftOnes = findLeft(index1, index2, m);
					int temp1 = Math.min(upperOnes, lowerOnes);
					int temp2 = Math.min(rightOnes, leftOnes);
					int result = Math.min(temp1, temp2);

					if (result > maxSize) {
						maxSize = result;
					}
				}
			}
		}
		return maxSize;
	}

	private int findLeft(int index1, int index2, int[][] m) {
		int count = 1;
		while (true) {
			if (index2 != 0) {
				if (m[index1][index2 - 1] == 1) {
					count++;
					index2--;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return count;
	}

	private int findRight(int index1, int index2, int[][] m) {
		int count = 1;

		while (true) {
			if (index2 != m[0].length - 1) {
				if (m[index1][index2 + 1] == 1) {
					count++;
					index2++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return count;
	}

	private int findLow(int index1, int index2, int[][] m) {
		int count = 1;
		while (true) {
			if (index1 != m.length - 1) {
				if (m[index1 + 1][index2] == 1) {
					count++;
					index1++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return count;
	}

	private int findUp(int index1, int index2, int[][] m) {
		int count = 1;
		while (true) {
			if (index1 != 0) {
				if (m[index1 - 1][index2] == 1) {
					count++;
					index1--;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return count;
	}

}
