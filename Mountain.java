package experiment;
public class Mountain {
	public static void main(String[] args) {
		float t = 1, sum = 0;
		for(int i = 0; i < 64; i++) {
			sum += t;
			t *= 2;
		}
		System.out.println("sum="+sum+"\t 2µÄ63´Î·½="+t/2);
	}
}
