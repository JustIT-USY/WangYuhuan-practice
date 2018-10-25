package experiment;

public class Flower {
	public static void main(String[] args) {
		int num,a,b,c;
		System.out.print("Ë®ÏÉ»¨Êý£º\n");
		for(num = 100; num <= 999; num++) {
			a = num % 10;
			b = num / 10 % 10;
			c = num / 100 % 10;
			if(num == (a*a*a + b*b*b + c*c*c)) {
				System.out.println(num);
			}
		}
	}
}
