package week4_2;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		System.out.println("�����������");
		System.out.println("1.ȡ��");
		System.out.println("2.���");
		System.out.println("3.�˳�");
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		switch(number){
		case 1:
			System.out.println("ȡ��");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("�˳�");
			break;
		default:
			System.out.println("��������");
			break;
		}
	}

}
