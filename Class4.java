package week4_2;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		System.out.println("请输入三种排列方式的排尾人数：");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int p;
		for(p=10;p<=100;p++){
			if((p%3==a)&&(p%5==b)&&(p%7==c)){
				System.out.println(p);
				break;
			}if(p==100){
				System.out.println("无解");
			}
		}
	}
}
