package circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		final float PI=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		float r=sc.nextFloat();
		System.out.println("圆的周长为："+2*PI*r);
		sc.close();
	}
}
