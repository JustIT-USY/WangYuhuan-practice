package week4_2;

import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		System.out.println("请输入学生分数：（1-100）");
		Scanner sc=new Scanner(System.in);
		int grade=sc.nextInt();
		if(grade>=90){
			System.out.println(grade+"对应的考核成绩是：优秀");
		}else if(grade>=80){
			System.out.println(grade+"对应的考核成绩是：良好");
		}else if(grade>=70){
			System.out.println(grade+"对应的考核成绩是：一般");
		}else if(grade>=60){
			System.out.println(grade+"对应的考核成绩是：及格");
		}else{
			System.out.println(grade+"对应的考核成绩是：不及格");
		}
	}

}
