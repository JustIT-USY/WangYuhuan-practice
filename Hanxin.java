package experiment;
import java.util.Scanner;
public class Hanxin {
	public static void main(String[] args) {
		System.out.println("�������������з�ʽ�Ķ�β������");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int p=10;
		while(p<=100) {
			if(p % 3 == a && p % 5 == b && p % 7 == c) {
				System.out.print(p);
				break;
			}
			p++;
		}
		if(p>100) {
			System.out.print("No Answer");
		}
		sc.close();
	}
}
