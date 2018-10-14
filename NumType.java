package demo;

import java.util.Scanner;

public class NumType {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("请输入编号：");
	   int num=sc.nextInt();
	   System.out.println("请输入姓名：");
	   String name=sc.next();
	   System.out.println("编号："+num+"，姓名："+name);
		/*
	   System.out.println("请输入数字1或2:");
	   //完成一个名字叫做re的输入类的创建
	   Scanner re=new Scanner(System.in);
	   //调用re的nextInt()方法，把输入的整数赋值给num
	   String str=re.nextLine();
	   System.out.println(str);
	   
	   int num=re.nextInt();
	   if(num==1){
		   System.out.println("我是诸葛亮");
	   }else {
		   System.out.println("我是曹操");
	   }
	   */
	}

}
