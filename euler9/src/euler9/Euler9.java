package euler9;

public class Euler9 {

	public long productOfTripletWhereSumIs(int n) {
		
		for (int a=1; a<n/3; a++) {
			for (int b=a+1; b<n-1; b++) {
				int c = n - a - b;
				if ((c*c) == ((a*a)+(b*b))){
					return (a*b*c);
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Euler9 e = new Euler9();
		System.out.println(e.productOfTripletWhereSumIs(1000));
	}

}
