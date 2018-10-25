package experiment;
public class Tests {
	public static void main(String[] args) {
		byte a = 31, b = 45;
		short c = 4500, d = 4500;
		int i = 90222, j = 5544555;
		long x = 567891234, y = 567891234;
		System.out.println(a+"   "+b);
		result(compare(a,b));
		System.out.println(c+"   "+d);
		result(compare(c,d));
		System.out.println(i+"   "+j);
		result(compare(i,j));
		System.out.println(x+"   "+y);
		result(compare(x,y));
	}
	static byte compare(byte a,byte b) {
		if(a==b) {
			return 1;
		}else {
			return 0;
		}
	}
	static int compare(int a,int b) {
		if(a==b) {
			return 1;
		}else {
			return 0;
		}
	}
	static short compare(short a,short b) {
		if(a==b) {
			return 1;
		}else {
			return 0;
		}
	}
	static long compare(long a,long b) {
		if(a==b) {
			return 1;
		}else {
			return 0;
		}
	}
	static void result(long a) {
		if(a==1) {
			System.out.println("这两个数相等");
		}else {
			System.out.println("这两个数不相等");
		}
	}
}
