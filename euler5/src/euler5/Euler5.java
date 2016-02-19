package euler5;

public class Euler5 {

	public boolean evenlyDivisibleOneToTwenty(long num) {
		for (int i=20; i > 0; i--) {
			if (num%i != 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Euler5 e = new Euler5();
		for (long i=20; i>0; i+=20) {
			if (e.evenlyDivisibleOneToTwenty(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
