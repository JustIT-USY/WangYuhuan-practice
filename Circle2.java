package circle;

import java.util.Scanner;

public class Circle2 {
	public static void main(String[] args) {
		final double PI=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double r=sc.nextDouble();
		System.out.println("圆的周长为："+2*PI*r);
		sc.close();
	}
}
