package experiment;

public class Money {
	public static void main(String[] args) {
		double income = 0;
		int i;
		for(i = 1;income != 100; i++) {
			income += 2.5;
			if(i % 5 == 0) {
				income -= 6;
			}//System.out.println("第"+i+"天，小芳可以存到"+income+"元钱");
		}
		System.out.println("第"+(--i)+"天，小芳可以存到100元钱");
	}
}
 