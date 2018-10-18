package week4_2;

import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数（1-100）：");
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		int a=0,sum=0;
		for(a=0;a<=number;a+=2){
			sum+=a;
		}
		System.out.println("0-"+number+"之间的所有偶数的和是："+sum);
	}

}
