package week4_2;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		System.out.println("请输入操作：");
		System.out.println("1.取款");
		System.out.println("2.存款");
		System.out.println("3.退出");
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		switch(number){
		case 1:
			System.out.println("取款");
			break;
		case 2:
			System.out.println("存款");
			break;
		case 3:
			System.out.println("退出");
			break;
		default:
			System.out.println("输入有误！");
			break;
		}
	}

}
