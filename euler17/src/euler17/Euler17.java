package euler17;

public class Euler17 {

	private static int[] numbers = new int[100];
	public void populateNumbers() {
		numbers[1] = 3;  //one
		numbers[2] = 3;  //two
		numbers[3] = 5;  //three
		numbers[4] = 4;  //four
		numbers[5] = 4;  //five
		numbers[6] = 3;  //six
		numbers[7] = 5;  //seven
		numbers[8] = 5;  //eight
		numbers[9] = 4;  //nine
		numbers[10] = 3; //ten
		numbers[11] = 6; //eleven
		numbers[12] = 6; //twelve
		numbers[13] = 8; //thirteen
		numbers[14] = 8; //fourteen
		numbers[15] = 7; //fifteen
		numbers[16] = 7; //sixteen
		numbers[17] = 9; //seventeen
		numbers[18] = 8; //eighteen
		numbers[19] = 8; //nineteen
		
		numbers[20] = 6; //twenty
		numbers[30] = 6; //thirty
		numbers[40] = 5; //forty
		numbers[50] = 5; //fifty
		numbers[60] = 5; //sixty
		numbers[70] = 7; //seventy
		numbers[80] = 6; //eighty
		numbers[90] = 6; //ninety
	}
	
	public int findLength(int num) {
		int tot = 0;
		int i = num;
		while (num > 0) {
			if (numbers[i] != 0) { //find a non-zero element
				tot += numbers[i];
				num -= i;
				i = num;
			} else { //iterate backwards until non-zero found
				i--;
			}
		}
		return tot;
	}
	
	public int total(int[] arr) {
		int tot = 0;
		for (int i=0; i<arr.length; tot += arr[i], i++);
		return tot;
	}
	
	public static void main(String[] args) {
		Euler17 e = new Euler17();
		e.populateNumbers();
		int tot = 0;
		int subHundred = 0;
		for (int i=1; i<100; i++) {
			subHundred += e.findLength(i);
		}
		tot += subHundred;
		System.out.println(tot);
		for (int i = 1; i<10; i++) {
			tot += (e.findLength(i) + 7); //i hundred
			tot += ((e.findLength(i) + 10)*99) + subHundred; //i hundred and [number]
			System.out.println(tot);
		}
		tot += 11; //one thousand
		System.out.println(tot);
	}
}
