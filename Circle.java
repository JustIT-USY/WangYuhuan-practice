package circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		final float PI=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		float r=sc.nextFloat();
		System.out.println("Բ���ܳ�Ϊ��"+2*PI*r);
		sc.close();
	}
}
