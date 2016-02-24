package euler18;

public class Euler18 {

	public static final int _ROWS = 15;
	public static final String treeString ="75 "
										 +"95 64 "
									    +"17 47 82 "
									   +"18 35 87 10 "
									  +"20 04 82 47 65 "
									 +"19 01 23 75 03 34 "
									+"88 02 77 73 07 63 67 "
								   +"99 65 04 28 06 16 70 92 "
								  +"41 41 26 56 83 40 80 70 33 "
								 +"41 48 72 33 47 32 37 16 94 29 "
								+"53 71 44 65 25 43 91 52 97 51 14 "
							   +"70 11 33 28 77 73 17 78 39 68 17 57 "
							  +"91 71 52 38 17 14 91 43 58 50 27 29 48 "
							 +"63 66 04 68 89 53 67 30 73 16 69 87 40 31 "
							+"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
	
	public static int getPos(int row, int i) {
		for (; row > 0; row--) i += row;
		return i;
	}
	
	public static void main(String[] args) {
		int[][] pyramid = new int[_ROWS][];
		String[] sp = treeString.split(" ");
		for (int r = 0; r < _ROWS; r++) {
			pyramid[r] = new int[r+1];
			for (int i=0; i<(r+1); i++) {
				pyramid[r][i] = Integer.parseInt(sp[getPos(r, i)]);
			}
		}
		System.out.println(getGreatestPathSum(pyramid));
	}
	
	public static int getGreatestPathSum(int[][] pyr) {
		for (int r = pyr.length-2; r >= 0; r--) {
			for (int i = 0; i < pyr[r].length; i++) {
				pyr[r][i] += Math.max(pyr[r+1][i], pyr[r+1][i+1]);
			}
		}
		return pyr[0][0];
	}

}
