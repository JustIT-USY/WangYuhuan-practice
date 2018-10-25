package experiment;

public class Moun {
	public static void main(String[] args) {
		float t = 0.01f;
		int i;
		for(i = 1; t <= 8848; i++) {
			t *= 2;
			//System.out.println("i="+i+"\t t="+t);
		}
		System.out.println("折叠"+(--i)+"次后"+"  纸张厚度为"+t+"m，超过了8848m");	
	}
}
