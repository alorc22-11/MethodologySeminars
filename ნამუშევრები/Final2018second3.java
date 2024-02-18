import acm.program.ConsoleProgram;

public class Final2018second3 extends ConsoleProgram{
	public void run(){
		int[][] m = {{1,0,0,1,1,1,0,0},
				{0,1,0,1,0,0,0,0},
				{0,0,1,0,1,0,1,0},
				{0,1,0,1,0,1,0,0},
				{1,0,0,0,1,0,1,0}};
		println(ixi(m));
	}

	private int ixi(int[][] m) {
		int maxSize = 1;
		for(int i = 0; i < m.length; i ++){
			for(int j = 0; j < m[0].length; j ++){
				int size = findSize(m, i ,j);
				if(size > maxSize){
					maxSize = size;
				}
			}
		}
		return maxSize;
	}

	private int findSize(int[][] m, int i, int j) {
		int northEast = findNorthEast(m, i, j);
		int northWest = findNorthWest(m, i, j);
		int southEast = findSouthEast(m, i, j);
		int southWest = findSouthWest(m, i, j);
		int temp1 = Math.min(northEast, northWest);
		int temp2 = Math.min(southEast, southWest);
		int result = Math.min(temp1, temp2);
		return result;
	}

	private int findSouthWest(int[][] m, int i, int j) {
		int count = 1;
		while(true){
			if(i!= m.length -1 && j != 0){
				if(m[i+1][j-1] == 1){
					count++;
					i ++;
					j --;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		return count;
	}

	private int findSouthEast(int[][] m, int i, int j) {
		int count = 1;
		while(true){
			if(i!= m.length -1 && j != m[0].length -1){
				if(m[i+1][j+1] == 1){
					count++;
					i ++;
					j ++;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		return count;
	}

	private int findNorthWest(int[][] m, int i, int j) {
		int count = 1;
		while(true){
			if(i!= 0 && j != 0){
				if(m[i-1][j-1] == 1){
					count++;
					i --;
					j --;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		return count;
	}

	private int findNorthEast(int[][] m, int i, int j) {
		int count = 1;
		while(true){
			if(i!= 0 && j !=m[0].length -1){
				if(m[i-1][j+1] == 1){
					count++;
					i --;
					j ++;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		return count;
	}
}
