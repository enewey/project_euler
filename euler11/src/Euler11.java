import java.util.ArrayList;

public class Euler11 {
	
	public int[][] _grid;

	public void fillGrid(int rows, int cols, ArrayList<Integer> data) {
		_grid = new int[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				_grid[i][j] = data.get((i*rows) + j);
			}
		}
	}
	
	public int getHorizontalSum(int row, int col, int seq) {
		int sum = 1;
		for (int i=0; i<seq; i++) sum *= _grid[row][col+i];
		return sum;
	}
	
	public int getVerticalSum(int row, int col, int seq) {
		int sum = 1;
		for (int i=0; i<seq; i++) sum *= _grid[row+i][col];
		return sum;
	}
	
	public int getBackDiagonalSum(int row, int col, int seq) {
		int sum = 1;
		for (int i=0; i<seq; i++) sum *= _grid[row+i][col+i];
		return sum;
	}
	
	public int getForwardDiagonalSum(int row, int col, int seq) {
		int sum = 1;
		for (int i=0; i<seq; i++) sum *= _grid[row+i][col-i];
		return sum;
	}
	
	public int getGreatestSeq(int size) {
		int largest = -1;
		// '----'
		for (int r=0; r < _grid.length; r++) {
			for (int c=0; c < _grid[r].length - size; c++) {
				int num = getHorizontalSum(r,c,size);
				if (num > largest) largest = num;
			}
		}
		// '|'
		for (int r=0; r < _grid.length - size; r++) {
			for (int c=0; c < _grid[r].length; c++) {
				int num = getVerticalSum(r,c,size);
				if (num > largest) largest = num;
			}
		}
		//  '\' going down-right
		for (int r=0; r < _grid.length-size; r++) {
			for (int c=0; c < _grid[r].length-size; c++) {
				int num = getBackDiagonalSum(r,c,size);
				if (num > largest) largest = num;
			}
		}
		// '/' going down-left
		for (int r=0; r < _grid.length-size; r++) {
			for (int c=size-1; c < _grid[r].length; c++) {
				int num = getForwardDiagonalSum(r,c,size);
				if (num > largest) largest = num;
			}
		}
		
		return largest;
	}
	
	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=2; i<args.length; i++) {
			list.add(Integer.parseInt(args[i]));
		}
		
		Euler11 e = new Euler11();
		e.fillGrid(rows, cols, list);
		//System.out.println(Arrays.deepToString(e._grid));
		System.out.println(e.getGreatestSeq(4));
	}

}
