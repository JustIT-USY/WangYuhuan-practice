package experiment;
public class Number {
	public static void main(String[] args) {
		for(int i = 10000; i < 100000; i++) {
			int a = i/10000;//万
			int b = (i/1000)%10;//千
			int c = (i/100)%10;//百
			int d = (i/10)%10;//十
			int e = i%10;//个
			if(e==a && d==b && e+d+b+a==c) {
				System.out.println("符合条件的五位数:"+i);
			}
		}
		/*
		System.out.println("==========================");
		int x,y;
		for(x = 1; x <= 9; x++) {
			for(y = 0; y <= 9 && (x + y)*2 <= 9; y++) {
				System.out.println("符合条件的五位数:"+(x*10001+y*1010+(x+y)*200));
			}
		}
		System.out.println("==========================");
		int x,y;
		for(x = 1; x <= 4; x++) {
			for(y = 0; y <= (4 - x); y++) {
				System.out.println("符合条件的五位数:"+(x*10001+y*1010+(x+y)*200));
			}
		}
		*/
	}
}
